package dev.pedrolavor.jirawebhookdiscord.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Issue {

  private Long id;
  private String self;
  private String key;
  private IssueFields fields;
  
}