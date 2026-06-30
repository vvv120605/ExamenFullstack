package cl.duoc.itinerary.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "itinerary_activities")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItineraryActivities {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String activityName;

    private String description;

    private LocalDateTime activityDate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "itinerary_id", nullable = false)
    private Itinerary itinerary;
}