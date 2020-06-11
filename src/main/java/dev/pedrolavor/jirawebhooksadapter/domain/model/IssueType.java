package dev.pedrolavor.jirawebhooksadapter.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class IssueType {
  
  private String self;
  private Long id;
  private String description;
  private String iconUrl;
  private String name;
  private String subtask;

}