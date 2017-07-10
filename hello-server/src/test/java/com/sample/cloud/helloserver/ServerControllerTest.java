package com.sample.cloud.helloserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import static org.hamcrest.Matchers.containsString;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * Created by tarunsapra on 10/07/2017.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ServerController.class)
public class ServerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testGetString() throws Exception {
        mockMvc.perform(get("/rest/data")).andDo(MockMvcResultHandlers.print()).andExpect(status().isOk()).andExpect(content().string(containsString("Hello World From Server")));
    }
}
