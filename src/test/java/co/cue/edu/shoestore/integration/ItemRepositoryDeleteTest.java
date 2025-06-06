package co.cue.edu.shoestore.integration;

import co.cue.edu.shoestore.api.model.Item;
import co.cue.edu.shoestore.api.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ItemRepositoryDeleteTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    void shouldDeleteItemById() {
        Item item = itemRepository.save(new Item(null, "botas", "botas tumba muros")); // <- Reemplaza builder

        itemRepository.deleteById(item.getId());

        Optional<Item> deleted = itemRepository.findById(item.getId());
        assertThat(deleted).isEmpty();
    }
}
