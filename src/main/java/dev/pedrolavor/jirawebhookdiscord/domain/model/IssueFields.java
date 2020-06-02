package dev.pedrolavor.jirawebhookdiscord.domain.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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