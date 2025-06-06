package co.cue.edu.shoestore.e2e;

import co.cue.edu.shoestore.api.model.Item;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class PostItemTest extends BaseE2ETest {

    @Test
    void shouldCreateItem() throws Exception {
        // Crea el objeto con constructor clásico
        Item item = new Item(null, "cholas", "invierno");

        mockMvc.perform(post("/api/items")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(item)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").exists())
                .andExpect(jsonPath("$.name").value("cholas"));
    }
}
