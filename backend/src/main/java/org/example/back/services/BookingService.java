package org.example.back.services;

import java.util.List;
import java.util.Optional;

import org.example.back.models.Booking;
import org.example.back.repositories.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    public Optional<Booking> findById(Long id) {
        return bookingRepository.findById(id);
    }

    public Booking save(Booking booking) {
        return bookingRepository.save(booking);
    }

    public void delete(Long id) {
        bookingRepository.deleteById(id);
    }
}
