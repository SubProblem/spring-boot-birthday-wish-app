package com.subproblem.birthdaywishapp.dto;

import java.time.LocalDate;

public record UserRequestDto(
        String firstname,
        String lastname,
        String email,
        LocalDate dateOfBirth
) {
}
