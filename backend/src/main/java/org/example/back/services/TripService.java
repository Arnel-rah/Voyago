package org.example.back.services;

import java.util.List;
import java.util.Optional;

import org.example.back.models.Trip;
import org.example.back.repositories.TripRepository;
import org.springframework.stereotype.Service;

@Service
public class TripService {

    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<Trip> findAll() {
        return tripRepository.findAll();
    }

    public Optional<Trip> findById(Long id) {
        return tripRepository.findById(id);
    }

    public Trip save(Trip trip) {
        return tripRepository.save(trip);
    }

    public void delete(Long id) {
        tripRepository.deleteById(id);
    }
}
