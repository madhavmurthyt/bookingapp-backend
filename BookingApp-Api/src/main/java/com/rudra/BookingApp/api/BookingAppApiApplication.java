package com.rudra.BookingApp.api;


import com.rudra.BookingApp.service.ServiceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ServiceConfiguration.class)
public class BookingAppApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookingAppApiApplication.class, args);
    }

}
