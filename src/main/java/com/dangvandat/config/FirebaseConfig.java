package com.dangvandat.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.*;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;
import java.io.InputStream;

@Configuration
public class FirebaseConfig {

    private final ResourceLoader resourceLoader;

    /*@Autowired
    private FireBaseService fireBaseService;*/

    @Autowired
    public FirebaseConfig(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Bean
    public FirebaseDatabase firebaseDatabase() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:datdv-bida-cadfa-firebase-adminsdk-hbno4-d1e4616224.json");
        InputStream inputStream = resource.getInputStream();
        FirebaseOptions firebaseOptions = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(inputStream))
                .setDatabaseUrl("https://datdv-bida-cadfa-default-rtdb.firebaseio.com/")
                .build();
        FirebaseApp.initializeApp(firebaseOptions);
        return FirebaseDatabase.getInstance();
    }

    @Bean
    public DatabaseReference databaseReference(FirebaseDatabase firebaseDatabase) {
        DatabaseReference ref = firebaseDatabase.getReference();
        ref.addValueEventListener(new ValueEventListener() {

            @SneakyThrows
            public void onDataChange(DataSnapshot dataSnapshot) {
                /*fireBaseService.onChangeDateFireBase(dataSnapshot);*/
            }

            public void onCancelled(DatabaseError error) {
                System.out.print("Error: " + error.getMessage());
            }
        });

        return ref;
    }

}