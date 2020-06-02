package dev.pedrolavor.jirawebhookdiscord.domain.model;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Project {
  
  private String self;
  private Long id;
  private String key;
  private String name;
  private String projectTypeKey;
  private Map<String, String> avatarUrls;

}