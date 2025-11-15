package com.joseiedo.streaming;

import com.joseiedo.user.UserService;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StreamingServiceImpl implements StreamingService{

    private final UserService userService;

    public StreamingServiceImpl(UserService userService) {
        this.userService = userService;
    }

    public String get(){

        return "hey im inside streaming module " +  userService.get();
    }
}
