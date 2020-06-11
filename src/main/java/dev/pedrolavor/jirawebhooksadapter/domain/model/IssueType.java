package dev.pedrolavor.jirawebhooksadapter.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class IssueType {
  
  private String self;
  private Long id;
  private String description;
  private String iconUrl;
  private String name;
  private String subtask;

}