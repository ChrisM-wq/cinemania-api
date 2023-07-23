package dev.chrismc.cinemaniaapi.repository;

import dev.chrismc.cinemaniaapi.models.MovieModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<MovieModel, ObjectId> {
    Optional<MovieModel> findMovieByImdbId(String imdbId);
}