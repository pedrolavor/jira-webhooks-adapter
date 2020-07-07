package dev.pedrolavor.jirawebhooksadapter.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.pedrolavor.jirawebhooksadapter.domain.target.model.Target;
import dev.pedrolavor.jirawebhooksadapter.domain.target.service.TargetService;

@RestController
@RequestMapping("/targets")
public class TargetController {

  @Autowired
  private TargetService targetService;
  
  @PostMapping
  public Target addDiscrodTarget(@RequestBody String discordWebhookUrl) {
    Target target = Target.builder().callbackUrl(discordWebhookUrl).build();
    return targetService.save(target);
  }
  
}