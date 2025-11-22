package org.example.community.controller;

import org.example.community.dto.ReviewRequest;
import org.example.community.model.Review;
import org.example.community.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public Review createReview(@RequestBody ReviewRequest request) {
        Review review = new Review();
        review.setUserId(request.getUserId());
        review.setCourseId(request.getCourseId());
        review.setRating(request.getRating());
        review.setContent(request.getContent());
        return reviewService.saveReview(review);
    }

    @GetMapping
    public List<Review> getReviews() {
        return reviewService.getAllReviews();
    }
}
