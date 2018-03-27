import java.time.LocalDate;

public class ReservationCalcApp {

	public static void main(String[] args) {
		double pricePerNight = 145.0;
		
		System.out.println("Reservation Calculator:");
		
		int aMonth = Console.getInt("  Enter arrival month (01-12): ", 1, 12);
		int aDay = Console.getInt("    Enter arrival day (01-31): ", 1, 31);
		int aYear = Console.getInt("          Enter arrival year:  ");
		System.out.println();
		int dMonth = Console.getInt("Enter departure month (1-12): ", 1, 12);
		int dDay = Console.getInt("  Enter departure day (1-31): ", 1, 31);
		int dYear = Console.getInt("        Enter departure year: ");
		
		LocalDate arrivalDate = LocalDate.of(aYear, aMonth, aDay);
		LocalDate departureDate = LocalDate.of(dYear, dMonth, dDay);
		
		Reservation reservation = new Reservation(arrivalDate, departureDate);
		
		int numberOfNights = reservation.getNumberOfNights(arrivalDate, departureDate);
		double totalPrice = reservation.getTotalPrice(numberOfNights, pricePerNight);
		
		String msg = "  Arrival Date: " + reservation.getArrivalDateFormatted() + "\n"
				   + "Departure Date: " + reservation.getDepartureDateFormatted() + "\n"
				   + "         Price: " + reservation.getPriceFormatted(pricePerNight) + " per night\n"
				   + "   Total Price: " + reservation.getTotalPriceFormatted(totalPrice);
		System.out.println(msg);
		
		
		

	}

}
