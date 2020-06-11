package dev.pedrolavor.jirawebhooksadapter.discord.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Field {

  private String name;

  private String value;

  private boolean inline;
  
}