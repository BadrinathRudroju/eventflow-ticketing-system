package com.badrinath.inventory_service.response;

import com.badrinath.inventory_service.entity.Venue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventInventoryResponse {
    private String event;
    private Long capacity;
    private Venue venue;
}
