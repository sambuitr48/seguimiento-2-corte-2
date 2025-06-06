package co.cue.edu.shoestore.integration;

import co.cue.edu.shoestore.api.model.Item;
import co.cue.edu.shoestore.api.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ItemRepositoryInsertTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    void shouldInsertNewItem() {
        // Crea el objeto sin builder
        Item item = new Item(null, "Zapatillas", "Nike");

        // guarda el ítem
        Item saved = itemRepository.save(item);

        // verifica que tenga ID y que se haya guardado correctamente
        assertThat(saved.getId()).isNotNull();
        assertThat(saved.getName()).isEqualTo("Zapatillas"); // ← ahora sí es coherente
    }
}
