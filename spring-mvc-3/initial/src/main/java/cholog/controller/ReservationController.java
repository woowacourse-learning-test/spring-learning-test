package cholog.controller;

import cholog.exception.DuplicatedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {

    @ExceptionHandler(DuplicatedException.class)
    public ResponseEntity<Void> duplicatedException(DuplicatedException e) {
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/reservations/{id}")
    public ResponseEntity<Void> getReservation(@PathVariable Long id) {
        if (true) {
            throw new DuplicatedException("Reservation not found: id=" + id);
        }

        return ResponseEntity.ok().build();
    }
}
