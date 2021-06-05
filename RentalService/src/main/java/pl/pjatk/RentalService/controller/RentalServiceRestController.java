package pl.pjatk.RentalService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.RentalService.model.Movie;
import pl.pjatk.RentalService.service.RentalService;

@RestController
@RequestMapping("/movie")
public class RentalServiceRestController {

    private RentalService rentalService;

    public RentalServiceRestController(RentalService rentalService){
        this.rentalService = rentalService;
    }

    @GetMapping("/movie/{id}")
    public ResponseEntity<Movie> getMyMovie(@PathVariable Long id){
        return  ResponseEntity.ok(rentalService.getMovie(id));
    }

    @PutMapping("/isAvailable/{id}")
    public ResponseEntity<Movie> isAvailable(@PathVariable Long id){
        rentalService.returnMovie(id);
        return  ResponseEntity.ok(rentalService.getMovie(id));
    }

}
