package laur.springframework.websiteexample.repositories;

import laur.springframework.websiteexample.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
