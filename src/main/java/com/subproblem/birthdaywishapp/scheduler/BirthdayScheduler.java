package com.subproblem.birthdaywishapp.scheduler;

import com.subproblem.birthdaywishapp.repository.UserRepository;
import com.subproblem.birthdaywishapp.service.EmailService;
import com.subproblem.birthdaywishapp.service.UserService;
import com.subproblem.birthdaywishapp.util.Mapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@RequiredArgsConstructor
@Slf4j
@Service
public class BirthdayScheduler {

    private final UserRepository userRepository;
    private final EmailService emailService;


    @Scheduled(fixedRate = 60000)
    public void sendBirthdayEmails() {

        int day = LocalDate.now().getDayOfMonth();
        int month = LocalDate.now().getMonthValue();

        var users = userRepository.findByBirthdayMonthAndDay(month, day);

        log.info("Users: {}", users);

        users.forEach(
                u -> emailService.sendEmail(u.getEmail(), u.getFirstname())
        );
    }
}
