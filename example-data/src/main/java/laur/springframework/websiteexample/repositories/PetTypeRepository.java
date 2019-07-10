package laur.springframework.websiteexample.repositories;

import laur.springframework.websiteexample.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
