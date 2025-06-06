package co.cue.edu.shoestore.integration;

import co.cue.edu.shoestore.api.model.Item;
import co.cue.edu.shoestore.api.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class ItemRepositoryFindTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    void shouldFindAllItems() {
        itemRepository.save(new Item(null, "zapatos", "escolares")); // <- Reemplaza builder

        List<Item> items = itemRepository.findAll();
        assertThat(items).isNotEmpty();
    }
}
