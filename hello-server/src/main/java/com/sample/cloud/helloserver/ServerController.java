package com.sample.cloud.helloserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tarunsapra on 08/07/2017.
 */

@RestController
@RequestMapping("/rest/data")
public class ServerController {

    @GetMapping
    public String getString() {
        return "Hello World From Server";
    }

}
