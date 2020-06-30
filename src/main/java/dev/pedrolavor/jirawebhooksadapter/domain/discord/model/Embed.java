package dev.pedrolavor.jirawebhooksadapter.domain.discord.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Embed {

  private Author author;

  private String title;

  private String url;

  private String description;

  private Integer color;

  private List<Field> fields;

  private Thumbnail thumbnail;

  private Image image;

  private Footer footer;
  
}