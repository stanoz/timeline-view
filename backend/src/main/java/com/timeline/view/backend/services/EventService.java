package com.timeline.view.backend.services;

import com.timeline.view.backend.mappers.EventMapper;
import com.timeline.view.backend.model.dtos.EventDto;
import com.timeline.view.backend.model.dtos.PageDto;
import com.timeline.view.backend.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    public PageDto<EventDto> getPaginatedEventsByDates(int page, int size) {
        Page<EventDto> eventsPage = eventRepository
                .findAll(PageRequest.of(page, size, Sort.by("dateTime").ascending()))
                .map(EventMapper::toDto);
        return PageDto.<EventDto>builder()
                .content(eventsPage.getContent())
                .page(eventsPage.getNumber())
                .hasNext(eventsPage.hasNext())
                .build();
    }
}
