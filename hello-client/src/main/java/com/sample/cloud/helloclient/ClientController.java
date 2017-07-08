package com.sample.cloud.helloclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tarunsapra on 08/07/2017.
 */
@RestController
@RequestMapping("/client/rest")
public class ClientController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public String getString() {
        String url = "http://hello-server/rest/data";
        return restTemplate.getForObject(url, String.class);
    }
}
