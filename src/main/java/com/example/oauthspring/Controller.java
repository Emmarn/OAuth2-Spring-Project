package com.example.oauthspring;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @ResponseBody
    @GetMapping("/")
    public String home(){
        return "The home page!";

    }

    @GetMapping("/GitUser")
    public String users(@AuthenticationPrincipal OAuth2User principal)
    {
        return "You have logged in as: " + principal.getAttribute("login");
    }
}
