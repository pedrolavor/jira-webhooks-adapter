package dev.pedrolavor.jirawebhooksadapter.api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.pedrolavor.jirawebhooksadapter.domain.discord.model.Post;
import dev.pedrolavor.jirawebhooksadapter.domain.discord.service.DiscordService;
import dev.pedrolavor.jirawebhooksadapter.domain.discord.util.DiscordPostBuilder;
import dev.pedrolavor.jirawebhooksadapter.domain.jira.model.IssueEvent;
import dev.pedrolavor.jirawebhooksadapter.domain.target.model.Target;
import dev.pedrolavor.jirawebhooksadapter.domain.target.service.TargetService;

@RestController
public class WebhookController {

    @Autowired
    private TargetService targetService;

    @Autowired
    private DiscordPostBuilder discordBuilder;

    @Autowired
    private DiscordService discordService;

    @PostMapping("/{targetId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void receiveNotification(
        @PathVariable String targetId,
        @RequestBody IssueEvent event
    ) throws Exception {

        Target target = targetService.findOrThrow(targetId);
        Post post = discordBuilder.newIssue(event);

        ObjectMapper m = new ObjectMapper();
        System.out.println(m.writeValueAsString(post));

        discordService.send(target.getCallbackUrl(), post);

    }
    
}