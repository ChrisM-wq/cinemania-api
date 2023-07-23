package dev.chrismc.cinemaniaapi.controllers;

import dev.chrismc.cinemaniaapi.models.ReviewModel;
import dev.chrismc.cinemaniaapi.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<ReviewModel> newReview(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<ReviewModel>(reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }
}
