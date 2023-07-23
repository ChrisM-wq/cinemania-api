package dev.chrismc.cinemaniaapi.repository;

import dev.chrismc.cinemaniaapi.models.ReviewModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<ReviewModel, ObjectId> {
}
