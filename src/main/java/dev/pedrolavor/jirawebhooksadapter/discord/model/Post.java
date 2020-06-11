package dev.pedrolavor.jirawebhooksadapter.discord.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Post {

  private String username;

  @JsonProperty("avatar_url")
  private String avatarUrl;

  private String content;

  private List<Embed> embeds;
  
}