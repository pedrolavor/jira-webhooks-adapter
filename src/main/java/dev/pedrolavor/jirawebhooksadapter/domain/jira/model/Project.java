package dev.pedrolavor.jirawebhooksadapter.domain.jira.model;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Project {
  
  private String self;
  private Long id;
  private String key;
  private String name;
  private String projectTypeKey;
  private Map<String, String> avatarUrls;

}