package com.subproblem.birthdaywishapp.repository;

import com.subproblem.birthdaywishapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE MONTH(u.dateOfBirth) = :month AND DAY(u.dateOfBirth) = :day")
    List<User> findByBirthdayMonthAndDay(int month, int day);
}