package dev.pedrolavor.jirawebhooksadapter.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class IssueStatus {

  private String self;
  private String description;
  private String iconUrl;
  private String name;
  private Long id;
  private StatusCategory statusCategory;

  @Getter
  @Setter
  public static class StatusCategory {

    private String self;
    private Long id;
    private String key;
    private String colorName;
    private String name;

  }
  
}