package com.dmitring.yastaskmanager.user_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @RequestMapping("/current-user")
    public Principal getUser(Principal principal) {
        return principal;
    }

    @RequestMapping("test")
    public String getTestString() {
        return "test";
    }
}

