package dev.pedrolavor.jirawebhooksadapter.domain.discord.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dev.pedrolavor.jirawebhooksadapter.domain.discord.model.Post;

@Service
public class DiscordService {

  public void send(String url, Post post) {
    RestTemplate restTemplate = new RestTemplate();
    restTemplate.postForEntity(url, createRequest(post), null);
  }
  
  private HttpEntity<Post> createRequest(Post post) {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    return new HttpEntity<Post>(post, headers);
  }
  
}