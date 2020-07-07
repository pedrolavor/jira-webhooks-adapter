package dev.pedrolavor.jirawebhooksadapter.domain.target.repository;

import java.time.OffsetDateTime;
import java.util.UUID;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dev.pedrolavor.jirawebhooksadapter.domain.exception.RepositoryException;
import dev.pedrolavor.jirawebhooksadapter.domain.target.model.Target;

@Repository
public class TargetRepository {

    @Autowired
    private Firestore firestore;

    public Target find(String id) throws RepositoryException {
        DocumentReference docRef = firestore.collection("targets").document(id);
        ApiFuture<DocumentSnapshot> result = docRef.get();

        try {
            return result.get().toObject(Target.class);
        } catch (Exception e) {
            throw new RepositoryException(e.getMessage(), e);
        }
    }

    public Target save(Target target) {
        target.setId(UUID.randomUUID().toString());
        target.setCreateAt(OffsetDateTime.now());
        
        DocumentReference docRef =
            firestore.collection("targets").document(target.getId());
        
        docRef.set(target);

        return target;
    }
    
}