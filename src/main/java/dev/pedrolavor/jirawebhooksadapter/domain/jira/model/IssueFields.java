package dev.pedrolavor.jirawebhooksadapter.domain.jira.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class IssueFields {

  @JsonProperty("issuetype")
  private IssueType issueType;
  private String description;
  private Project project;
  private String summary;
  private User creator;
  private Date created;
  private User reporter;
  private Date updated;
  private IssueStatus status;
  
}