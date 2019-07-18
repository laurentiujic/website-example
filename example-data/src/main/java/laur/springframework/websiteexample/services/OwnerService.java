package laur.springframework.websiteexample.services;

import laur.springframework.websiteexample.model.Owner;

import java.util.List;


public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
