package laur.springframework.websiteexample.repositories;

import laur.springframework.websiteexample.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
