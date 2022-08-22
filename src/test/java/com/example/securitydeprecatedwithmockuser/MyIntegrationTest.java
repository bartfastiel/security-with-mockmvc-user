package com.example.securitydeprecatedwithmockuser;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
public class MyIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void secretUnauthorized() throws Exception {
        mockMvc.perform(get("/a"))
                .andExpect(status().isUnauthorized());
    }

    @Test
    @WithMockUser(authorities = "BASIC")
    public void secretForbidden() throws Exception {
        mockMvc.perform(get("/a"))
                .andExpect(status().isForbidden());
    }

    @Test
    @WithMockUser(authorities = "ADMIN")
    public void secretAuthorized() throws Exception {
        mockMvc.perform(get("/a"))
                .andExpect(status().isOk()); // fails: is 403 Forbidden
    }
}
