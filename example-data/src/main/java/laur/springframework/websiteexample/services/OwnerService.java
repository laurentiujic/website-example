package laur.springframework.websiteexample.services;

import laur.springframework.websiteexample.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
