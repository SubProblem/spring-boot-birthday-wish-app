package com.subproblem.birthdaywishapp.controller;

import com.subproblem.birthdaywishapp.dto.UserRequestDto;
import com.subproblem.birthdaywishapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;


    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody UserRequestDto request) {
        return userService.addUser(request);
    }
}
