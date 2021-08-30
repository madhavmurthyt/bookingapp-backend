package com.rudra.BookingApp.service;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.rudra.BookingApp.service")
@EntityScan("com.rudra.BookingApp.service.entity")
public class ServiceConfiguration {

}
