package com.subproblem.birthdaywishapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${user}")
    private String senderEmail;

    public void sendEmail(String email, String firstname) {

        var message = new SimpleMailMessage();

        String subject = "Happy Birthday";
        String body = "Happy Birthday Dear " + firstname;

        message.setFrom(senderEmail);
        message.setSubject(subject);
        message.setText(body);
        message.setTo(email);

        // Configure your email and password in application.yaml to send mail
        // mailSender.send(message);

        // Logging email details for mock email sending during testing
        log.info("email: {}", message);
    }
}
