package cl.duoc.itinerary.repository;

import cl.duoc.itinerary.model.ItineraryActivities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ItineraryActivitiesRepository extends JpaRepository<ItineraryActivities, UUID> {

    List<ItineraryActivities> findByItineraryId(UUID itineraryId);
}