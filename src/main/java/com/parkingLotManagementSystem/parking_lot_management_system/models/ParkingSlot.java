package com.parkingLotManagementSystem.parking_lot_management_system.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ParkingSlot {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String slotNumber;
	private boolean isOccupied;
	
	public ParkingSlot() {
		
	}
	public ParkingSlot(String slotNumber, boolean isOccupied) {
		this.slotNumber = slotNumber;
		this.isOccupied = isOccupied;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSlotNumber() {
		return slotNumber;
	}
	public void setSlotNumber(String slotNumber) {
		this.slotNumber = slotNumber;
	}
	public boolean isOccupied() {
		return isOccupied;
	}
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	
	@Override
	public String toString() {
		return "ParkingSlot [id=" + id + ", slotNumber=" + slotNumber + ", isOccupied=" + isOccupied + "]";
	}
	
	

}
