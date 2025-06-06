package co.cue.edu.shoestore.api.service.impl;

import co.cue.edu.shoestore.api.model.Item;
import co.cue.edu.shoestore.api.repository.ItemRepository;
import co.cue.edu.shoestore.api.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ItemServiceImpl implements ItemService {

    public ItemServiceImpl(ItemRepository repository) {
        this.repository = repository;
    }

    private final ItemRepository repository; // Inyectamos el repositorio JPA

    @Override
    public List<Item> getAllItems() {
        return repository.findAll(); // Llama a la función heredada de JPA
    }

    @Override
    public Optional<Item> getItemById(Long id) {
        return repository.findById(id); // Busca por ID
    }

    @Override
    public Item createItem(Item item) {
        return repository.save(item); // Persiste la entidad en la BD
    }

    @Override
    public void deleteItem(Long id) {
        repository.deleteById(id); // Elimina por ID
    }
}
