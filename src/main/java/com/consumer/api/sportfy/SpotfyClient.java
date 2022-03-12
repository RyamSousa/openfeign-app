package com.consumer.api.sportfy;

import com.consumer.api.sportfy.models.Album;
import com.consumer.api.sportfy.models.Token;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import static org.springframework.http.MediaType.*;

@FeignClient(name = "consumer-api", url = "https://accounts.spotify.com/api")
public interface SpotfyClient {

    @PostMapping(path = "/token", consumes = APPLICATION_FORM_URLENCODED_VALUE, produces = APPLICATION_JSON_VALUE)
    Token getAccessToken(
            @RequestHeader(value = "Authorization", required = true) String authorizationHeader,
            String grantType
    List<YoutubeResponse> getMostPopular(
            @RequestParam("part") String part,
            @RequestParam("chart") String chart,
            @RequestParam("maxResults") String maxResults
    );

    @GetMapping
    List<YoutubeResponse> getMostPopular(
            @RequestParam("part") String part,
            @RequestParam("chart") String chart
    );
}
