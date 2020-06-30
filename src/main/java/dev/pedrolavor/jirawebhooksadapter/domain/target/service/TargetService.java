package dev.pedrolavor.jirawebhooksadapter.domain.target.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.pedrolavor.jirawebhooksadapter.domain.target.model.Target;
import dev.pedrolavor.jirawebhooksadapter.domain.target.repository.TargetRepository;

@Service
public class TargetService {

    @Autowired
    private TargetRepository targetRepository;

    public Target save(Target target) {
        return targetRepository.save(target);
    }
    
}