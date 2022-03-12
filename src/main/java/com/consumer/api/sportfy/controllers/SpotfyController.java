package com.consumer.api.sportfy.controllers;

import com.consumer.api.sportfy.SpotfyClient;
import com.consumer.api.sportfy.models.Token;
import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("api")
public class SpotfyController {

    @Autowired
    SpotfyClient spotfyClient;

    @PostMapping(path = "/token", consumes = APPLICATION_FORM_URLENCODED_VALUE, produces = APPLICATION_JSON_VALUE)
    public Token getToken(
            @RequestHeader(value = "Authorization", required = true) String authorizationHeader,
            @RequestBody String grantType) {
        return spotfyClient.getAccessToken(authorizationHeader,grantType);
    }

    @PostMapping(path = "/token", consumes = APPLICATION_FORM_URLENCODED_VALUE, produces = APPLICATION_JSON_VALUE)
    public Token getAlbums(@RequestHeader(value = "Authorization", required = true) String authorizationHeader,) {
        return spotfyClient.getAccessToken(authorizationHeader);
    }

    @PostMapping(path = "/redirect", consumes = APPLICATION_FORM_URLENCODED_VALUE)
    public void redirectUrl(@RequestBody String token) {
        System.out.println("Token: " + token);
    }
}
