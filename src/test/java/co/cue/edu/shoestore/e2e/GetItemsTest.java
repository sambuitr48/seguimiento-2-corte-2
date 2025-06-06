package co.cue.edu.shoestore.e2e;

import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class GetItemsTest extends BaseE2ETest {

    @Test
    void shouldReturnListOfItems() throws Exception {
        // Simula una petición GET a /api/items
        mockMvc.perform(get("/api/items"))
                .andExpect(status().isOk()) // Espera código 200 OK
                .andExpect(content().contentType("application/json")); // Espera tipo de respuesta JSON
    }
}
