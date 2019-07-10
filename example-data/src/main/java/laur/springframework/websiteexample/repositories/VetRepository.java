package laur.springframework.websiteexample.repositories;

import laur.springframework.websiteexample.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
