package dev.pedrolavor.jirawebhooksadapter.domain.jira.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class IssueEvent {

  private Long timestamp;
  private String webhookEvent;
  @JsonProperty("issue_event_type_name")
  private String issueEventTypeName;
  private User user;
  private Issue issue;
  private Changelog changelog;
  
}