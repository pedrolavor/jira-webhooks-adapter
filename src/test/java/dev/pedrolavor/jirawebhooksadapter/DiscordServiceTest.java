package dev.pedrolavor.jirawebhooksadapter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import dev.pedrolavor.jirawebhooksadapter.discord.model.Post;
import dev.pedrolavor.jirawebhooksadapter.discord.service.DiscordService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DiscordServiceTest {

  @Value("${discord.webhook.test}")
  private String url;

  @Autowired
  private DiscordService discordService;

  @Test
  public void whenSendAPost_ThenSuccess() {

    Post post = Post.builder()
    .content("Hi, this is a test message from discord service .")
    .build();

    discordService.send(url, post);

  }
  
}