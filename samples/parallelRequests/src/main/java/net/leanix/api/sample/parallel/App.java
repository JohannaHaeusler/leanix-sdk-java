package net.leanix.api.sample.parallel;

import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.PrintStream;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiClientBuilder;
import net.leanix.api.sample.parallel.config.ArgumentOptions;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private final static Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        App bean = new App();
        ArgumentOptions options = new ArgumentOptions();
        CmdLineParser parser = new CmdLineParser(options);

        // if you have a wider console, you could increase the value;
        // here 80 is also the default
        parser.getProperties().withUsageWidth(100);

        try {
            parser.parseArgument(args);
            if (options.help) {
                showHelp(parser, System.out);
                return;
            }
            bean.run(options);
        } catch (CmdLineException e) {
            // if there's a problem in the command line,
            // you'll get this exception. this will report
            // an error message.
            System.err.println(e.getMessage());
            System.err.println("");
            showHelp(parser, System.err);
        }
    }

    public static void showHelp(CmdLineParser parser, PrintStream ps) {
        ps.println("java -jar <App.jar> [options...] arguments...");
        // print the list of available options
        parser.printUsage(ps);
        ps.println();
    }

    private void run(ArgumentOptions options) throws InterruptedException, ExecutionException {
        System.out.println(options);

        ApiClient apiClient = new ApiClientBuilder()
            .withBasePath(String.format("https://%s/api/v1", options.apiHostName))
            .withApiToken(options.apiToken)
            .withTokenProviderHost(options.apiMtmHostName)
            .build();
        ListeningExecutorService executorService =
                MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(options.threadCount));
        RandomFactSheetPopulator factSheetPopulator = new RandomFactSheetPopulator(options, apiClient, executorService);


        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.out.println("*** received shutdown ***");
                finishRun(executorService, factSheetPopulator);
            }
        });

        // run import
        factSheetPopulator.run();
        finishRun(executorService, factSheetPopulator);
    }

    public void finishRun(ListeningExecutorService executorService, RandomFactSheetPopulator factSheetPopulator) {
        // show summary
        factSheetPopulator.showSummary();

        // Stop executor service
        try {
            LOG.info("Stopping Executor Service...");
            executorService.awaitTermination(10, TimeUnit.SECONDS);
            List<Runnable> shutdownNow = executorService.shutdownNow();
            System.out.println(shutdownNow.size());
            LOG.info("Stopping Executor Service...DONE");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}