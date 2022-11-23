package com.africancooking.backend.repositories;

import com.africancooking.backend.data.ReviewData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<ReviewData, Long> {

}
