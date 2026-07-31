package com.timeline.view.backend.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collation = "events")
public class Event {
    @Id
    private String id;

    private String description;

    private LocalDateTime dateTime;
}
