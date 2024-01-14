package com.subproblem.birthdaywishapp.util;

import com.subproblem.birthdaywishapp.dto.UserRequestDto;
import com.subproblem.birthdaywishapp.dto.UserResponseDto;
import com.subproblem.birthdaywishapp.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Mapper {

    public UserResponseDto ToResponse(User user) {
        return new UserResponseDto(
                user.getId(),
                user.getFirstname(),
                user.getLastname(),
                user.getEmail(),
                user.getDateOfBirth()
        );
    }

    public User toUser(UserRequestDto requestDto) {
        return User.builder()
                .firstname(requestDto.firstname())
                .lastname(requestDto.lastname())
                .email(requestDto.email())
                .dateOfBirth(requestDto.dateOfBirth())
                .build();
    }


    public List<UserResponseDto> userResponseList(List<User> users) {
        return users.stream()
                .map(this::ToResponse)
                .toList();
    }
}
