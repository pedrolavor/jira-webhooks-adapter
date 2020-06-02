package dev.pedrolavor.jirawebhookdiscord.domain.model;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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