package pl.pjatk.RentalService.nbp.nbpservice;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.RentalService.nbp.nbpmodel.Rate;
import pl.pjatk.RentalService.nbp.nbpmodel.Root;

import java.util.List;

@Service
public class NbpService {
    private final RestTemplate restTemplate;

    public NbpService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Root getExchangeRate(List<Rate> rates){
        String url = "http://api.nbp.pl/api/exchangerates/rates/a/{code}/last/{topCount}/?format=json";
        return restTemplate.getForObject(url, Root.class);
    }
}


