package pl.pjatk.RentalService.nbp.nbpcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.RentalService.model.Movie;
import pl.pjatk.RentalService.nbp.nbpmodel.Root;
import pl.pjatk.RentalService.nbp.nbpservice.NbpService;

@RestController
@RequestMapping("/exchangerate")
public class NbpController {
    private NbpService nbpService;

    public NbpController(NbpService nbpService){
        this.nbpService = nbpService;
    }

    //@GetMapping("/get/{code}/{days}")
    //public ResponseEntity<Root> getExchangeRates(@PathVariable String code, @RequestParam Long topCount ){
       // return ResponseEntity.ok(nbpService.getExchangeRate(code, topCount));

  //  }
}
