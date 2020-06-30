package dev.pedrolavor.jirawebhooksadapter.domain.discord.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Footer {

  private String text;

  @JsonProperty("icon_url")
  private String iconUrl;
  
}