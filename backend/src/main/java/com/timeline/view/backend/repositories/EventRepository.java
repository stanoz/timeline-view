package com.timeline.view.backend.repositories;

import com.timeline.view.backend.model.entity.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {
    Page<Event> findAll(Pageable pageable);
}
