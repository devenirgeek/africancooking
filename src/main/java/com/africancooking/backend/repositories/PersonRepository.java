package com.africancooking.backend.repositories;

import com.africancooking.backend.data.PersonData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<PersonData, Long> {

}
