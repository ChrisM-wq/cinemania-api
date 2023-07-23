package dev.chrismc.cinemaniaapi.services;

import dev.chrismc.cinemaniaapi.models.MovieModel;
import dev.chrismc.cinemaniaapi.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<MovieModel> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<MovieModel> findMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }

}
