package com.badrinath.inventory_service.controller;

import com.badrinath.inventory_service.response.EventInventoryResponse;
import com.badrinath.inventory_service.response.VenueInventoryResponse;
import com.badrinath.inventory_service.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class InventoryController {

    InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }
    @GetMapping("/inventory/events")
    public @ResponseBody List<EventInventoryResponse> inventoryGetAllEvents() {
        return inventoryService.getAllEvents();
    }

    @GetMapping("/inventory/events/{venueId}")
    public @ResponseBody VenueInventoryResponse inventoryByVenueId(@PathVariable("venueId") Long VenueId){
        return inventoryService.getVenueinformation(VenueId);
    }
}
