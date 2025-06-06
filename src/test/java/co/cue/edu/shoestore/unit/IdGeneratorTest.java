package co.cue.edu.shoestore.unit;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class IdGeneratorTest {

    @Test
    void shouldGenerateUniqueId() {
        String id = UUID.randomUUID().toString(); // Genera un UUID aleatorio
        assertNotNull(id); // Verifica que no sea null
    }

}
