package com.sample.cloud.helloclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tarunsapra on 17/07/2017.
 */
@Service
public class ClientService {

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public String getString() {
        String url = "http://hello-server/rest/data";
        return restTemplate.getForObject(url, String.class);
    }

    public String fallbackMethod() {
        return "Response from the fallback Method";
    }
}
