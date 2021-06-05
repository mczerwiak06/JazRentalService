package pl.pjatk.RentalService.service;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.RentalService.model.Movie;

@Service
public class RentalService {
    private final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Movie getMovie(Long id){

    String movieServiceAddress = "http://localhost:8080/movies/" + id;
        return restTemplate.getForObject(movieServiceAddress, Movie.class);
    }
    public void returnMovie(Long id){
        String movieServiceAddress = "http://localhost:8080/movies/available/" + id;
        restTemplate.put(movieServiceAddress, Movie.class);
    }
}
