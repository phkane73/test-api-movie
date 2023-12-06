package com.testapi.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movie")
public class movieController {
    @Autowired
    private movieService movieService;


    @GetMapping
    public ResponseEntity<?> allMovies(){
        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
    }
}
