package dev.pedrolavor.jirawebhooksadapter.discord.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Author {

  private String name;

  private String url;

  @JsonProperty("icon_url")
  private String iconUrl;
  
}