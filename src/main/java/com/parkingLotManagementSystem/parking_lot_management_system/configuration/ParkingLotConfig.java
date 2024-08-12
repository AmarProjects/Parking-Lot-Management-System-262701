package com.parkingLotManagementSystem.parking_lot_management_system.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.parkingLotManagementSystem.parking_lot_management_system.models.ParkingSlot;
import com.parkingLotManagementSystem.parking_lot_management_system.repositories.ParkingLotRepositories;

@Configuration
public class ParkingLotConfig {
	@Bean
	 CommandLineRunner commandLineRunner(ParkingLotRepositories repository) {
		return args->{
			repository.save(new ParkingSlot("A1", false));			
			repository.save(new ParkingSlot("A2", false));			
			repository.save(new ParkingSlot("A3", false));			
			
			
		};
	}
}
