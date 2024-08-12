package com.parkingLotManagementSystem.parking_lot_management_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parkingLotManagementSystem.parking_lot_management_system.models.ParkingSlot;

public interface ParkingLotRepositories extends JpaRepository<ParkingSlot, Long> {
	ParkingSlot findBySlotNumber(String slotNomber);

}
