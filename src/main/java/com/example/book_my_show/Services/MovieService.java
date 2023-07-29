package com.example.book_my_show.Services;


import com.example.book_my_show.Entities.MovieEntity;
import com.example.book_my_show.EntryDtos.MovieEntryDto;
import com.example.book_my_show.Repository.MovieRepository;
import com.example.book_my_show.convetors.MovieConvertors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieEntryDto movieEntryDto)throws Exception{


        MovieEntity movieEntity = MovieConvertors.convertEntryDtoToEntity(movieEntryDto);
 // dto_>Entity
        movieRepository.save(movieEntity);

        return "Movie Added successfully";


    }

}
