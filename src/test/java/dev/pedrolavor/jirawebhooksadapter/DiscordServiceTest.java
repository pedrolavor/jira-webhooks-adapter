package dev.pedrolavor.jirawebhooksadapter;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import dev.pedrolavor.jirawebhooksadapter.discord.model.Post;
import dev.pedrolavor.jirawebhooksadapter.discord.service.DiscordService;
import dev.pedrolavor.jirawebhooksadapter.discord.util.DiscordPostBuilder;
import dev.pedrolavor.jirawebhooksadapter.domain.model.Issue;
import dev.pedrolavor.jirawebhooksadapter.domain.model.IssueEvent;
import dev.pedrolavor.jirawebhooksadapter.domain.model.IssueFields;
import dev.pedrolavor.jirawebhooksadapter.domain.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DiscordServiceTest {

  @Value("${discord.webhook.test}")
  private String url;

  @Autowired
  private DiscordService discordService;

  @Autowired
  private DiscordPostBuilder postBuilder;

  @Test
  public void whenSendAPost_ThenSuccess() {

    Post post = Post.builder()
    .content("Hi, this is a test message from discord service .")
    .build();

    discordService.send(url, post);

  }

  @Test
  public void createPostFromIssueAndSendRequest_thenSuccess() {

    Map<String, String> avatarUrls = new HashMap<>();
    avatarUrls.put("24x24", "http://192.140.40.170:8090/secure/useravatar?size=small&ownerId=pedro.lavor&avatarId=10900");

    User creator = User.builder()
    .displayName("Pedro Lavôr")
    .avatarUrls(avatarUrls)
    .build();

    IssueEvent issueEvent = IssueEvent.builder()
    .issue(
      Issue.builder()
      .key("TEST-23")
      .self("http://192.140.40.170:8090/rest/api/2/issue/11157")
      .fields(
          IssueFields.builder()
          .summary("Testing discord pos builder")
          .creator(creator)
          .build())
      .build())
    .build();

    Post post = postBuilder.newIssue(issueEvent);
    discordService.send(url, post);
  }
  
}