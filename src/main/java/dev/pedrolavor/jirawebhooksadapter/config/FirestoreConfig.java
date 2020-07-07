package dev.pedrolavor.jirawebhooksadapter.config;

import java.io.IOException;
import java.io.InputStream;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class FirestoreConfig {

    @Bean
    public Firestore getFirestore() throws IOException {
        InputStream serviceAccount =
            new ClassPathResource("google_credentials.json").getInputStream();
        
        GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
        
        FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(credentials)
            .build();

        FirebaseApp.initializeApp(options);

        return FirestoreClient.getFirestore();
    }
    
}