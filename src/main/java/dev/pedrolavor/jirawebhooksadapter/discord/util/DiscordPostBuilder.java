package dev.pedrolavor.jirawebhooksadapter.discord.util;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import dev.pedrolavor.jirawebhooksadapter.discord.model.Author;
import dev.pedrolavor.jirawebhooksadapter.discord.model.Embed;
import dev.pedrolavor.jirawebhooksadapter.discord.model.Footer;
import dev.pedrolavor.jirawebhooksadapter.discord.model.Post;
import dev.pedrolavor.jirawebhooksadapter.domain.model.IssueEvent;

@Service
public class DiscordPostBuilder {

  public Post newIssue(IssueEvent issueEvent) {

    String creatorName = issueEvent.getIssue().getFields().getCreator().getDisplayName();
    String creatorIconUrl = issueEvent.getIssue().getFields().getCreator().getAvatarUrls().get("24x24");
    String title = issueEvent.getIssue().getKey() + " - " + issueEvent.getIssue().getFields().getSummary();
    String issueUrl = issueEvent.getIssue().getSelf();

    Embed embed = Embed.builder()
    .author(new Author(creatorName, null, creatorIconUrl))
    .title(title)
    .url(issueUrl)
    .description("Hey, there! A new issue has just been created!")
    .footer(new Footer("Powered by pedrolavor.dev", null))
    .build();

    return new Post(null, null, null, Arrays.asList(embed));
  }
  
}