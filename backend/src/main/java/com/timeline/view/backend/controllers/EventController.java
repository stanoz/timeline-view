package com.timeline.view.backend.controllers;

import com.timeline.view.backend.model.dtos.EventDto;
import com.timeline.view.backend.model.dtos.PageDto;
import com.timeline.view.backend.services.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventController {
    private static final String DEFAULT_PAGE_SIZE = "4";

    private final EventService eventService;

    @GetMapping
    public ResponseEntity<PageDto<EventDto>> getEventsByDate(@RequestParam(defaultValue = "0") int page,
                                                             @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int size) {
        return ResponseEntity.ok(eventService.getPaginatedEventsByDates(page, size));
    }
}
