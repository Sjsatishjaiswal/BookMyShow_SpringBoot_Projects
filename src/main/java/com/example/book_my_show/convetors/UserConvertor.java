package com.example.book_my_show.convetors;

import com.example.book_my_show.Entities.UserEntity;
import com.example.book_my_show.EntryDtos.UserEntryDto;

public class UserConvertor
{

    //Static is kept to avoid calling it via objects/instances
    public static UserEntity convertDtoToEntity(UserEntryDto userEntryDto){

        UserEntity userEntity =  UserEntity.builder().age(userEntryDto.getAge()).address(userEntryDto.getAddress())
                .email(userEntryDto.getEmail()).name(userEntryDto.getName()).mobNo(userEntryDto.getMobNo())
                .build();

        return userEntity;

    }
}