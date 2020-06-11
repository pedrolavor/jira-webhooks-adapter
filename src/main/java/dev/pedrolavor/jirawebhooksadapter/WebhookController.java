package dev.pedrolavor.jirawebhooksadapter;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.pedrolavor.jirawebhooksadapter.domain.model.IssueEvent;

@RestController
public class WebhookController {

  @PostMapping
  public void teste(@RequestBody IssueEvent body) {
    System.out.println(body);
  }
  
}