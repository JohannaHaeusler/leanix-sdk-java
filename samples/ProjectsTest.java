/*
 * The MIT License (MIT)	 
 *
 * Copyright (c) 2013 LeanIX GmbH
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

import java.util.List;

import net.leanix.api.*;
import net.leanix.api.common.*;
import net.leanix.api.models.*;

public class ProjectsTest
{
	public static void main(String[] args)
	{
		try
		{
			ApiClient client = new ApiClient();
			client.setBasePath("https://www.leanix.net/demo/api/v1");
			client.setApiKey("31c7cfa0b5cb755f4c7f146c92d0ad6b");
			
			Project project = new Project();
			project.setName("New Project Name");
			
			ProjectsApi projectsApi = new ProjectsApi(client);
			
			List<Project> projects = projectsApi.getProjects(true, null);
			for (Project cur : projects)
			{
				System.out.println(cur);
			}
			
			List<ServiceHasProject> serviceHasProjects = projectsApi.getServiceHasProjects("160000021");
			for (ServiceHasProject cur : serviceHasProjects)
			{
				System.out.println(cur);
			}
		}
		catch (Exception ex)
		{
			System.out.println("Exception: " + ex.getMessage());
		}
	}

}
