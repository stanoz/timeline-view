package com.timeline.view.backend.model.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collation = "events")
@Builder
@Data
public class Event {
    @Id
    @Setter(AccessLevel.NONE)
    private String id;

    private String description;

    private LocalDateTime dateTime;
}
