package cl.duoc.itinerary.repository;

import cl.duoc.itinerary.model.Itinerary;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItineraryRepository extends JpaRepository<Itinerary, UUID> {
}
