package model.entities;

import java.util.Date;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		super();
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	//No setCheckIn because of method updateDates()
	
	public Date getCheckOut() {
		return checkOut;
	}
	
	//No setCheckOut because of method updateDates()
	
	public Integer duration() {
		
	}
	
}
