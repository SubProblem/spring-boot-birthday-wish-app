package com.subproblem.birthdaywishapp.service;

import com.subproblem.birthdaywishapp.dto.UserRequestDto;
import com.subproblem.birthdaywishapp.repository.UserRepository;
import com.subproblem.birthdaywishapp.util.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final Mapper mapper;

    public ResponseEntity<?> addUser(UserRequestDto requestDto) {

        var user = mapper.toUser(requestDto);

        userRepository.save(user);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public ResponseEntity<?> getAllUsers() {

        var users = userRepository.findAll();

        var response = mapper.userResponseList(users);

        return ResponseEntity.ok(response);
    }
}
