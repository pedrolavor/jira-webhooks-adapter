package dev.pedrolavor.jirawebhooksadapter.domain.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Changelog {
  
  private Long id;
  private List<ChangelogItem> items;

}