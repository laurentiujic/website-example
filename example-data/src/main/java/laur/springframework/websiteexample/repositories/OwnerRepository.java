package laur.springframework.websiteexample.repositories;

import laur.springframework.websiteexample.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
