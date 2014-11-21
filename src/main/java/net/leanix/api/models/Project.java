/*
* The MIT License (MIT)	 
*
* Copyright (c) 2014 LeanIX GmbH
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

package net.leanix.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.*;

import java.util.*;
import net.leanix.api.models.ProjectUpdate;
import net.leanix.api.models.FactSheetHasDocument;
import net.leanix.api.models.FactSheetHasLifecycle;
import net.leanix.api.models.FactSheetHasChild;
import net.leanix.api.models.ServiceHasProject;
import net.leanix.api.models.ProjectHasProvider;
import net.leanix.api.models.FactSheetHasParent;
public class Project implements Serializable
{
	/*  */
	private String ID = null;
	/*  */
	private String displayName = null;
	/*  */
	private String parentID = null;
	/*  */
	private Long level = null;
	/*  */
	private String name = null;
	/*  */
	private String reference = null;
	/*  */
	private String alias = null;
	/*  */
	private String description = null;
	/*  */
	private String businessValueID = null;
	/*  */
	private String businessValueDescription = null;
	/*  */
	private String projectRiskID = null;
	/*  */
	private String projectRiskDescription = null;
	/*  */
	private Double budgetOpex = null;
	/*  */
	private Double budgetCapex = null;
	/*  */
	private List<String> tags = new ArrayList<String>();
	/*  */
	private String fullName = null;
	/*  */
	private String resourceType = null;
	/*  */
	private List<FactSheetHasLifecycle> factSheetHasLifecycles = new ArrayList<FactSheetHasLifecycle>();
	/*  */
	private List<FactSheetHasParent> factSheetHasParents = new ArrayList<FactSheetHasParent>();
	/*  */
	private List<FactSheetHasChild> factSheetHasChildren = new ArrayList<FactSheetHasChild>();
	/*  */
	private List<ServiceHasProject> serviceHasProjects = new ArrayList<ServiceHasProject>();
	/*  */
	private List<ProjectHasProvider> projectHasProviders = new ArrayList<ProjectHasProvider>();
	/*  */
	private List<ProjectUpdate> projectUpdates = new ArrayList<ProjectUpdate>();
	/*  */
	private List<FactSheetHasDocument> factSheetHasDocuments = new ArrayList<FactSheetHasDocument>();
	@JsonProperty("ID")
	public String getID()
	{
		return ID;
	}
	
	@JsonProperty("ID")
	public void setID(String ID)
	{
		this.ID = ID;
	}

	@JsonProperty("displayName")
	public String getDisplayName()
	{
		return displayName;
	}
	
	@JsonProperty("displayName")
	public void setDisplayName(String displayName)
	{
		this.displayName = displayName;
	}

	@JsonProperty("parentID")
	public String getParentID()
	{
		return parentID;
	}
	
	@JsonProperty("parentID")
	public void setParentID(String parentID)
	{
		this.parentID = parentID;
	}

	@JsonProperty("level")
	public Long getLevel()
	{
		return level;
	}
	
	@JsonProperty("level")
	public void setLevel(Long level)
	{
		this.level = level;
	}

	@JsonProperty("name")
	public String getName()
	{
		return name;
	}
	
	@JsonProperty("name")
	public void setName(String name)
	{
		this.name = name;
	}

	@JsonProperty("reference")
	public String getReference()
	{
		return reference;
	}
	
	@JsonProperty("reference")
	public void setReference(String reference)
	{
		this.reference = reference;
	}

	@JsonProperty("alias")
	public String getAlias()
	{
		return alias;
	}
	
	@JsonProperty("alias")
	public void setAlias(String alias)
	{
		this.alias = alias;
	}

	@JsonProperty("description")
	public String getDescription()
	{
		return description;
	}
	
	@JsonProperty("description")
	public void setDescription(String description)
	{
		this.description = description;
	}

	@JsonProperty("businessValueID")
	public String getBusinessValueID()
	{
		return businessValueID;
	}
	
	@JsonProperty("businessValueID")
	public void setBusinessValueID(String businessValueID)
	{
		this.businessValueID = businessValueID;
	}

	@JsonProperty("businessValueDescription")
	public String getBusinessValueDescription()
	{
		return businessValueDescription;
	}
	
	@JsonProperty("businessValueDescription")
	public void setBusinessValueDescription(String businessValueDescription)
	{
		this.businessValueDescription = businessValueDescription;
	}

	@JsonProperty("projectRiskID")
	public String getProjectRiskID()
	{
		return projectRiskID;
	}
	
	@JsonProperty("projectRiskID")
	public void setProjectRiskID(String projectRiskID)
	{
		this.projectRiskID = projectRiskID;
	}

	@JsonProperty("projectRiskDescription")
	public String getProjectRiskDescription()
	{
		return projectRiskDescription;
	}
	
	@JsonProperty("projectRiskDescription")
	public void setProjectRiskDescription(String projectRiskDescription)
	{
		this.projectRiskDescription = projectRiskDescription;
	}

	@JsonProperty("budgetOpex")
	public Double getBudgetOpex()
	{
		return budgetOpex;
	}
	
	@JsonProperty("budgetOpex")
	public void setBudgetOpex(Double budgetOpex)
	{
		this.budgetOpex = budgetOpex;
	}

	@JsonProperty("budgetCapex")
	public Double getBudgetCapex()
	{
		return budgetCapex;
	}
	
	@JsonProperty("budgetCapex")
	public void setBudgetCapex(Double budgetCapex)
	{
		this.budgetCapex = budgetCapex;
	}

	@JsonProperty("tags")
	public List<String> getTags()
	{
		return tags;
	}
	
	@JsonProperty("tags")
	public void setTags(List<String> tags)
	{
		this.tags = tags;
	}

	@JsonProperty("fullName")
	public String getFullName()
	{
		return fullName;
	}
	
	@JsonProperty("fullName")
	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}

	@JsonProperty("resourceType")
	public String getResourceType()
	{
		return resourceType;
	}
	
	@JsonProperty("resourceType")
	public void setResourceType(String resourceType)
	{
		this.resourceType = resourceType;
	}

	@JsonProperty("factSheetHasLifecycles")
	public List<FactSheetHasLifecycle> getFactSheetHasLifecycles()
	{
		return factSheetHasLifecycles;
	}
	
	@JsonProperty("factSheetHasLifecycles")
	public void setFactSheetHasLifecycles(List<FactSheetHasLifecycle> factSheetHasLifecycles)
	{
		this.factSheetHasLifecycles = factSheetHasLifecycles;
	}

	@JsonProperty("factSheetHasParents")
	public List<FactSheetHasParent> getFactSheetHasParents()
	{
		return factSheetHasParents;
	}
	
	@JsonProperty("factSheetHasParents")
	public void setFactSheetHasParents(List<FactSheetHasParent> factSheetHasParents)
	{
		this.factSheetHasParents = factSheetHasParents;
	}

	@JsonProperty("factSheetHasChildren")
	public List<FactSheetHasChild> getFactSheetHasChildren()
	{
		return factSheetHasChildren;
	}
	
	@JsonProperty("factSheetHasChildren")
	public void setFactSheetHasChildren(List<FactSheetHasChild> factSheetHasChildren)
	{
		this.factSheetHasChildren = factSheetHasChildren;
	}

	@JsonProperty("serviceHasProjects")
	public List<ServiceHasProject> getServiceHasProjects()
	{
		return serviceHasProjects;
	}
	
	@JsonProperty("serviceHasProjects")
	public void setServiceHasProjects(List<ServiceHasProject> serviceHasProjects)
	{
		this.serviceHasProjects = serviceHasProjects;
	}

	@JsonProperty("projectHasProviders")
	public List<ProjectHasProvider> getProjectHasProviders()
	{
		return projectHasProviders;
	}
	
	@JsonProperty("projectHasProviders")
	public void setProjectHasProviders(List<ProjectHasProvider> projectHasProviders)
	{
		this.projectHasProviders = projectHasProviders;
	}

	@JsonProperty("projectUpdates")
	public List<ProjectUpdate> getProjectUpdates()
	{
		return projectUpdates;
	}
	
	@JsonProperty("projectUpdates")
	public void setProjectUpdates(List<ProjectUpdate> projectUpdates)
	{
		this.projectUpdates = projectUpdates;
	}

	@JsonProperty("factSheetHasDocuments")
	public List<FactSheetHasDocument> getFactSheetHasDocuments()
	{
		return factSheetHasDocuments;
	}
	
	@JsonProperty("factSheetHasDocuments")
	public void setFactSheetHasDocuments(List<FactSheetHasDocument> factSheetHasDocuments)
	{
		this.factSheetHasDocuments = factSheetHasDocuments;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class Project {\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  displayName: ").append(displayName).append("\n");
		sb.append("  parentID: ").append(parentID).append("\n");
		sb.append("  level: ").append(level).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  reference: ").append(reference).append("\n");
		sb.append("  alias: ").append(alias).append("\n");
		sb.append("  description: ").append(description).append("\n");
		sb.append("  businessValueID: ").append(businessValueID).append("\n");
		sb.append("  businessValueDescription: ").append(businessValueDescription).append("\n");
		sb.append("  projectRiskID: ").append(projectRiskID).append("\n");
		sb.append("  projectRiskDescription: ").append(projectRiskDescription).append("\n");
		sb.append("  budgetOpex: ").append(budgetOpex).append("\n");
		sb.append("  budgetCapex: ").append(budgetCapex).append("\n");
		sb.append("  tags: ").append(tags).append("\n");
		sb.append("  fullName: ").append(fullName).append("\n");
		sb.append("  resourceType: ").append(resourceType).append("\n");
		sb.append("  factSheetHasLifecycles: ").append(factSheetHasLifecycles).append("\n");
		sb.append("  factSheetHasParents: ").append(factSheetHasParents).append("\n");
		sb.append("  factSheetHasChildren: ").append(factSheetHasChildren).append("\n");
		sb.append("  serviceHasProjects: ").append(serviceHasProjects).append("\n");
		sb.append("  projectHasProviders: ").append(projectHasProviders).append("\n");
		sb.append("  projectUpdates: ").append(projectUpdates).append("\n");
		sb.append("  factSheetHasDocuments: ").append(factSheetHasDocuments).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

