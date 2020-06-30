package dev.pedrolavor.jirawebhooksadapter.domain.jira.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class IssueStatus {

  private String self;
  private String description;
  private String iconUrl;
  private String name;
  private Long id;
  private StatusCategory statusCategory;

  @Getter
  @Setter
  @AllArgsConstructor
  @Builder
  public static class StatusCategory {

    private String self;
    private Long id;
    private String key;
    private String colorName;
    private String name;

  }
  
}