package ocpjp.chap3.singleton;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Show {
	private Set<String> availableSeats;
//	private static Show instance;

	public Show() {
//		availableSeats = new HashSet<String>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}

//	public static Show getInstance() {
//		if (instance  == null) {
//			instance = new Show();
//		}
//		return instance;
//	}

	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}

	public static void main(String[] args) {
//		Show show = Show.getInstance();
		Show show = new Show();
		show.ticketAgentBooks("1A");
		show.ticketAgentBooks("1A");
//		Calendar.getInstance()
	}

	public void ticketAgentBooks(String seat) {
		///Show show = new Show(); // a new Show gets created
		// each time we call the method
		//getInstance();
		System.out.println(bookSeat(seat));
	}
}
