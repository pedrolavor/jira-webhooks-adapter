package dev.pedrolavor.jirawebhooksadapter.domain.target.model;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Target {

    @EqualsAndHashCode.Include
    private String id;
    private String callbackUrl;
    private OffsetDateTime createAt;
    
}