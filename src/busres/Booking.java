package busres;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	String passname;
	int busno;
	Date date;
	
	public Booking(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of Passenger: ");
		this.passname = sc.next();
		System.out.print("Enter the Bus number: ");
		this.busno = sc.nextInt();
		System.out.println("Enter the Date (dd-mm-yyyy): ");
		String inputdate = sc.next();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(inputdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//sc.close();
	}
	

	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> busses) {
		
		int capacity = 0;
		int booked = 0;
		
		for (Bus bus:busses) {
			if (bus.getBusno() == busno) {
				capacity = bus.getCapacity();
			}
		}
		
		for (Booking booking:bookings) {
			if(booking.busno == busno && booking.date.equals(date)) {
				booked++;
			}
		}
		return booked < capacity ? true : false;
	}
}
