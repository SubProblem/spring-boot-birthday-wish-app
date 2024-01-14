# Birthday Wish Application

The Birthday Wish Application is a simple Spring Boot project designed to demonstrate how scheduling works in Spring Boot. The application sends birthday emails to users every day by utilizing Spring's Quartz scheduler, Java Mail Sender, Spring Data JPA, and Hibernate.

## Features

- **Scheduling:** The application uses Spring's scheduling capabilities to run a method every day, fetching users with birthdays on the current day and sending them birthday emails.

- **Quartz Scheduler:** Quartz is employed for job scheduling to execute specific tasks at defined intervals.

- **Java Mail Sender:** Birthday wishes are delivered to users via email using the Java Mail Sender.

- **Spring Data JPA and Hibernate:** Data persistence is managed through Spring Data JPA with Hibernate as the underlying ORM (Object-Relational Mapping) framework.
