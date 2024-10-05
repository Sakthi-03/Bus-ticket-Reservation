package busres;

import java.util.ArrayList;
import java.util.Scanner;

public class Busmodule {

	public static void main(String[] args) {
		ArrayList<Bus> busses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		
		busses.add(new Bus(1,true,5));
		busses.add(new Bus(2,false,2));
		busses.add(new Bus(3,true,3));
		
		for(Bus bus:busses) {
			bus.displayBusInfo();
			
		}
		System.out.println();
		Scanner sc1 = new Scanner(System.in);
		int no = 1;
		
		while(no == 1) {
			System.out.println("Press 1 for Booking and 2 for Exit!");
			no = sc1.nextInt();
			if (no == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings, busses)) {
					bookings.add(booking);
					System.out.println("Your Booking is Confirmed!...");
					
					
				}
				else {
					System.out.println("Try another Bus or Date...");
				}
			}
		}
		
	}

}
