package com.drade.training.room_clr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RoomClrApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomClrApplication.class, args);
	}
	@Bean
	public CommandLineRunner run() {
		return args -> {
			for (int i = 0; i < args.length; i++) {
				System.out.println("args[" + i + "] = " + args[i]);
			}
			int max = 100;
			try{
				if(args.length > 0) {
					max = Integer.parseInt(args[0]);
				}
			} catch (NumberFormatException e) {
				System.err.println("Invalid argument. Using default value of 100.");
			}

			for (int i = 1; i <= max; i++) {
				boolean normal = true;
				if ((i % 3)==0){
					System.out.print("Fizz");
					normal = false;
				}
				if ((i % 5)==0){
					System.out.print("Buzz");
					normal = false;
				}
				if(normal){
					System.out.print(i);
				}
				System.out.println("");
			}
		};
	}
}
