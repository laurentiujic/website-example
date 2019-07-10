package laur.springframework.websiteexample.repositories;

import laur.springframework.websiteexample.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
