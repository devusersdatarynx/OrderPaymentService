package com.datarynx.web.client.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datarynx.web.client.api.Tweet;

@RestController
public class TweetsSlowServiceController {

    @GetMapping("/slow-service-tweets")
    private List<Tweet> getAllTweets() throws Exception {
    	
        Thread.sleep(2000L);    // delay
        return Arrays.asList(
          new Tweet("RestTemplate rules", "@user1"),
          new Tweet("WebClient is better", "@user2"),
          new Tweet("OK, both are useful", "@user1"));
    }
}