package dev.pedrolavor.jirawebhooksadapter.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class IssueEvent {

  private Long timestamp;
  private String webhookEvent;
  @JsonProperty("issue_event_type_name")
  private String issueEventTypeName;
  private User user;
  private Issue issue;
  private Changelog changelog;
  
}