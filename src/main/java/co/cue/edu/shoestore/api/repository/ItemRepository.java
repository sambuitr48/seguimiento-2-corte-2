package co.cue.edu.shoestore.api.repository;

import co.cue.edu.shoestore.api.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
    // Hereda métodos CRUD (findAll, findById, save, deleteById) de JpaRepository
}
