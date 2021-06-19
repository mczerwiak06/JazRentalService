package pl.pjatk.RentalService.controller;

import io.swagger.annotations.ApiOperation;
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

        @ApiOperation(value= "Find movie by id", notes = "show movie with given id")
    @GetMapping("/get/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id){
        return  ResponseEntity.ok(rentalService.getMovie(id));
    }

    @PutMapping("/isAvailable/{id}")
    public ResponseEntity<Movie> isAvailable(@PathVariable Long id){
        rentalService.returnMovie(id);
        return  ResponseEntity.ok().build();
    }

    @PutMapping("/isUnavailable/{id}")
    public ResponseEntity<Movie> isUnavailable(@PathVariable Long id){
        rentalService.rentMovie(id);
        return ResponseEntity.ok().build();
    }
}
