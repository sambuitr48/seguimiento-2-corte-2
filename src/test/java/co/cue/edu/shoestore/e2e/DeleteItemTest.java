package co.cue.edu.shoestore.e2e;

import co.cue.edu.shoestore.api.model.Item;
import co.cue.edu.shoestore.api.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class DeleteItemTest extends BaseE2ETest {

    @Autowired
    private ItemRepository repository;

    @Test
    void shouldDeleteAndReturn404After() throws Exception {
        Item item = repository.save(new Item(null, "Guayos", "Fuchibol"));

        mockMvc.perform(delete("/api/items/" + item.getId()))
                .andExpect(status().isNoContent());

        mockMvc.perform(get("/api/items/" + item.getId()))
                .andExpect(status().isNotFound());
    }
}
