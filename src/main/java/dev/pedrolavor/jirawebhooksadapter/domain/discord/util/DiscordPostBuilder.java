package dev.pedrolavor.jirawebhooksadapter.domain.discord.util;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import dev.pedrolavor.jirawebhooksadapter.domain.discord.model.Author;
import dev.pedrolavor.jirawebhooksadapter.domain.discord.model.Embed;
import dev.pedrolavor.jirawebhooksadapter.domain.discord.model.Footer;
import dev.pedrolavor.jirawebhooksadapter.domain.discord.model.Post;
import dev.pedrolavor.jirawebhooksadapter.domain.jira.model.IssueEvent;

@Service
public class DiscordPostBuilder {

  public Post newIssue(IssueEvent issueEvent) {

    String creatorName = issueEvent.getIssue().getFields().getCreator().getDisplayName();
    String creatorIconUrl = issueEvent.getIssue().getFields().getCreator().getAvatarUrls().get("48x48");
    String createUrl = issueEvent.getIssue().getFields().getCreator().getSelf();
    String title = issueEvent.getIssue().getKey() + " - " + issueEvent.getIssue().getFields().getSummary();
    String issueUrl = issueEvent.getIssue().getSelf();

    Embed embed = Embed.builder()
    .author(new Author(creatorName, createUrl, creatorIconUrl))
    .title(title)
    .url(issueUrl)
    .description("Hey, there! A new issue has just been created!")
    .footer(new Footer("Powered by pedrolavor.dev", null))
    .build();

    return new Post(null, null, null, Arrays.asList(embed));
  }
  
}