package com.badrinath.inventory_service.service;

import com.badrinath.inventory_service.entity.Event;
import com.badrinath.inventory_service.repository.EventRepository;
import com.badrinath.inventory_service.repository.VenueRepository;
import com.badrinath.inventory_service.response.EventInventoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InventoryService {

    private final EventRepository eventRepository;
    private final VenueRepository venueRepository;

    @Autowired
    public InventoryService(EventRepository eventRepository, VenueRepository venueRepository) {
        this.eventRepository = eventRepository;
        this.venueRepository = venueRepository;
    }

    public List<EventInventoryResponse> getAllEvents() {
        List<Event> events = eventRepository.findAll();

        return events.stream()
                .map(event -> EventInventoryResponse.builder()
                .event(event.getName())
                .capacity(event.getLeftCapacity())
                        .venue(event.getVenue())
                        .build())
                        .collect(Collectors.toList());
    }
}
