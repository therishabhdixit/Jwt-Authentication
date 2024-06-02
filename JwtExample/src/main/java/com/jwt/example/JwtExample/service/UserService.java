package com.jwt.example.JwtExample.service;

import com.jwt.example.JwtExample.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public  UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Gravity","gravity@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"Skyhigh","skyhigh@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"Rezz","rezz@dev.in"));
    }

    public List<User> getUsers(){
        return this.store;
    }

}
