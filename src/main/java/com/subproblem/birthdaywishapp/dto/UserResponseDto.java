package com.subproblem.birthdaywishapp.dto;

import java.time.LocalDate;

public record UserResponseDto(
        Integer id,
        String firstname,
        String lastname,
        String email,
        LocalDate dateOfBirth
) {
}
