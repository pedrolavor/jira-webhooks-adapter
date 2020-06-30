package dev.pedrolavor.jirawebhooksadapter.domain.jira.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Changelog {
  
  private Long id;
  private List<ChangelogItem> items;

}