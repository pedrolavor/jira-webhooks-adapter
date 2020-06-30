package dev.pedrolavor.jirawebhooksadapter.domain.jira.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ChangelogItem {
  
  private String field;
  @JsonProperty("fieldtype")
  private String fieldType;
  private Object from;
  private String fromString;
  private Object to;
  private String toString;

}