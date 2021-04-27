package com.webtech.what2cook.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getUser (){
        return List.of(
                new User(
                        1L,
                        "Yannik",
                        "Gassmann",
                        "yannik.gassmann@gmail.com"
                )
        );
    }
}
