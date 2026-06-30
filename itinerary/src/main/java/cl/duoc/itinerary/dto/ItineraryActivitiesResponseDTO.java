package cl.duoc.itinerary.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItineraryActivitiesResponseDTO {

    private String activityName;
    private String description;
    private LocalDateTime activityDate;
    private String itineraryId;

    private List<ItineraryActivitiesResponseDTO> activities;
}