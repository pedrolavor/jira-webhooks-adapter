package dev.pedrolavor.jirawebhooksadapter.domain.target.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Target {

    private String id;
    private String callbackUrl;
    
}