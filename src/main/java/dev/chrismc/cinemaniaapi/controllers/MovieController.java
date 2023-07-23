package dev.chrismc.cinemaniaapi.controllers;

import dev.chrismc.cinemaniaapi.models.MovieModel;
import dev.chrismc.cinemaniaapi.services.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<MovieModel>> getAllTasks(){
        return new ResponseEntity<List<MovieModel>>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<MovieModel>> getMovie(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<MovieModel>>(movieService.findMovie(imdbId), HttpStatus.OK);
    }

//    @PostMapping("/add")
//    public ResponseEntity postBody(@RequestBody SongModel song) {
//        songService.addSong(song);
//        return new ResponseEntity(HttpStatus.OK);
//    }

}
