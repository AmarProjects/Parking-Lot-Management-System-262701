package com.parkingLotManagementSystem.parking_lot_management_system.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingLotManagementSystem.parking_lot_management_system.models.ParkingSlot;
import com.parkingLotManagementSystem.parking_lot_management_system.repositories.ParkingLotRepositories;

@Service
public class ParkingSlotService {
	
	@Autowired
	private ParkingLotRepositories parkingLotRepositories;
	
	public List<ParkingSlot> getAllSlots(){
		return parkingLotRepositories.findAll();
	}
	public ParkingSlot parkCar(String slotNumber) {
		ParkingSlot slot = parkingLotRepositories.findBySlotNumber(slotNumber);
		if(slot!=null && !slot.isOccupied()) {
			slot.setOccupied(true);
			return parkingLotRepositories.save(slot);
		}
		
		return null;
	}
	
	public ParkingSlot leaveCar(String slotNumber) {
		ParkingSlot slot = parkingLotRepositories.findBySlotNumber(slotNumber);
		
		if(slot!=null && slot.isOccupied()) {
			slot.setOccupied(false);
			return parkingLotRepositories.save(slot);
		}
		
		return null;
	}

}
