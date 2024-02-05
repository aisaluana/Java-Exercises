package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //definir como a data será retornada
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
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
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime(); //quantos millisegundos cada tempo tem
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //converte de millisegundos para dias
	}
	
	public String updateDates(Date checkIn, Date checkOut) {
		
		Date now = new Date(); //data atual
		if(checkIn.before(now) || checkOut.before(now)) {
			return "Reservation dates for update must be future dates!";
		}
		if(!checkOut.after(checkIn)) {
			return "CheckOut date must be after CheckIn date!";
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
		return null; //não deu nenhum erro
	}
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", check-out: "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
				
	}
	
}
