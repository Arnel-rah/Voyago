package org.example.back.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TripControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCreateTrip() throws Exception {
        String json = """
            {
              "destination": "Nosy Be",
              "price": 150.0
            }
        """;

        mockMvc.perform(post("/api/trips")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isCreated());
    }

    @Test
    void shouldGetAllTrips() throws Exception {
        mockMvc.perform(get("/api/trips"))
                .andExpect(status().isOk());
    }
}
