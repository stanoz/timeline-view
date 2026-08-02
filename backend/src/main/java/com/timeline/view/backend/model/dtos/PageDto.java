package com.timeline.view.backend.model.dtos;

import lombok.Builder;

import java.util.List;

@Builder
public record PageDto<T>(
        List<T> content,
        int page,
        boolean hasNext
) {
}
