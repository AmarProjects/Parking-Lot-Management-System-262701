package com.parkingLotManagementSystem.parking_lot_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parkingLotManagementSystem.parking_lot_management_system.models.ParkingSlot;
import com.parkingLotManagementSystem.parking_lot_management_system.services.ParkingSlotService;

@RestController
@RequestMapping("/api/parking")
public class ParkingController {
	@Autowired
	private ParkingSlotService parkingSlotService;
	
	@GetMapping("/slots")
	public List<ParkingSlot> getAllSlots(){
		return parkingSlotService.getAllSlots();
	}
	
	@PostMapping("/park/{slotNumber}")
	public ParkingSlot parkCar(@PathVariable String slotNumber) {
		return parkingSlotService.parkCar(slotNumber);
	}
	
	@PostMapping("/leave/{slotNumber}")
	public ParkingSlot leaveCar(@PathVariable String slotNumber) {
		return parkingSlotService.leaveCar(slotNumber);
	}
	
	
	
	

}
