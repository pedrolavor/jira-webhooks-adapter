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
public class User {
  
  private String self;
  private String name;
  private String key;
  private String emailAddress;
  private Map<String, String> avatarUrls;
  private String displayName;
  private boolean active;
  private String timeZone;

}