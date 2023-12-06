package com.testapi.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class movieService {
    @Autowired
    private movieRepository movieRepository;


    public List<movie> getAllMovies(){
        return movieRepository.findAll();
    }
}
