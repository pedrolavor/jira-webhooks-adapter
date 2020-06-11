package dev.pedrolavor.jirawebhooksadapter.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Issue {

  private Long id;
  private String self;
  private String key;
  private IssueFields fields;
  
}