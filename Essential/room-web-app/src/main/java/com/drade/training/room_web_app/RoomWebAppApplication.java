package com.drade.training.room_web_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.drade.training.room_web_app.data.repository.RoomRepository;

@SpringBootApplication
public class RoomWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomWebAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(RoomRepository roomRepository) {
		return args -> {
			roomRepository.findAll().forEach(System.out::println);
		};
	}

}
