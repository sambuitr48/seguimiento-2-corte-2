package co.cue.edu.shoestore.api.service;
import co.cue.edu.shoestore.api.model.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    List<Item> getAllItems(); // Lista todos los ítems
    Optional<Item> getItemById(Long id); // Busca por ID, puede o no existir
    Item createItem(Item item); // Crea un nuevo ítem
    void deleteItem(Long id); // Elimina un ítem por ID
}
