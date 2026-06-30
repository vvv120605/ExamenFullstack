package cl.duoc.itinerary.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItineraryActivitiesRequestDTO {

    @NotBlank(message = "El nombre de la actividad no puede estar vacío")
    private String activityName;

    @NotBlank(message = "La descripción no puede estar vacía")
    private String description;

    @NotNull(message = "La fecha de la actividad no puede ser nula")
    @FutureOrPresent(message = "La fecha debe ser actual o futura")
    private LocalDateTime activityDate;

    @NotNull(message = "El itinerario es obligatorio")
    private String itineraryId;
}