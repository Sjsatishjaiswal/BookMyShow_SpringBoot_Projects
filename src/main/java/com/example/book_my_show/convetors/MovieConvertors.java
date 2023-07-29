package com.example.book_my_show.convetors;


import com.example.book_my_show.Entities.MovieEntity;
import com.example.book_my_show.EntryDtos.MovieEntryDto;

public class MovieConvertors {


    public static MovieEntity convertEntryDtoToEntity(MovieEntryDto movieEntryDto){

        MovieEntity movieEntity = MovieEntity.builder()
                .movieName(movieEntryDto.getMovieName()).duration(movieEntryDto.getDuration())
                .genre(movieEntryDto.getGenre()).language(movieEntryDto.getLanguage()).ratings(movieEntryDto.getRatings()).build();

        return movieEntity;
    }
}
