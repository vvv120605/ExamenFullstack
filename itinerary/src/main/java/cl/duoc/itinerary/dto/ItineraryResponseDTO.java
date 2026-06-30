package cl.duoc.itinerary.dto;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItineraryResponseDTO {

    private UUID id;
    private String title;
    private String description;
    private UUID destinationId;

    private List<ItineraryActivitiesResponseDTO> activities;
}