package com.badrinath.inventory_service.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VenueInventoryResponse {
        private Long venueId;
        private String venueName;
        private Long totalCapacity;
}
