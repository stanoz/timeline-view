package com.timeline.view.backend.model.dtos;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record EventDto(String id,
                       String description,
                       LocalDateTime dateTime
) {
}
