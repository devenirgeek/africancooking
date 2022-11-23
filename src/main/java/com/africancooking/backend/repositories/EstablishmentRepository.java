package com.africancooking.backend.repositories;

import com.africancooking.backend.data.EstablishmentData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstablishmentRepository extends CrudRepository<EstablishmentData, Long> {

}
