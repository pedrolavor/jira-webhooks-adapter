package dev.pedrolavor.jirawebhooksadapter.domain.target.repository;

import java.util.UUID;

import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dev.pedrolavor.jirawebhooksadapter.domain.target.model.Target;

@Repository
public class TargetRepository {

    @Autowired
    private Firestore firestore;

    public Target save(Target target) {
        target.setId(UUID.randomUUID().toString());
        System.out.println(target.getId());
        
        DocumentReference docRef =
            firestore.collection("targets").document(target.getId());
        
        docRef.set(target);

        return target;
    }
    
}