package laur.springframework.websiteexample.services;

import laur.springframework.websiteexample.model.Vet;


public interface VetService extends CrudService<Vet, Long> {
    Vet findByLastName(String lastName);
}
