package com.timeline.view.backend.mappers;

import com.timeline.view.backend.model.dtos.EventDto;
import com.timeline.view.backend.model.entity.Event;

public class EventMapper {
    private EventMapper() {
    }

    public static EventDto toDto(Event eventEntity) {
        return EventDto.builder()
                .id(eventEntity.getId())
                .description(eventEntity.getDescription())
                .dateTime(eventEntity.getDateTime())
                .build();
    }
}
