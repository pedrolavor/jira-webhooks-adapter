package dev.pedrolavor.jirawebhookdiscord.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChangelogItem {
  
  private String field;
  @JsonProperty("fieldtype")
  private String fieldType;
  private Object from;
  private String fromString;
  private Object to;
  private String toString;

}