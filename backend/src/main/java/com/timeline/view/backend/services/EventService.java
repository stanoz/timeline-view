package com.timeline.view.backend.services;

import com.timeline.view.backend.mappers.EventMapper;
import com.timeline.view.backend.model.dtos.EventDto;
import com.timeline.view.backend.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    public Page<EventDto> getPaginatedEventsByDates(int page, int size) {
        return eventRepository
                .findAllOrderByDateTime(PageRequest.of(page, size, Sort.by("dateTime").ascending()))
                .map(EventMapper::toDto);
    }
}
