import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {

	private LocalDate arrivalDate;
	private LocalDate departureDate;
	
	public Reservation(){
		
	}

	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	
	
	
	public String getArrivalDateFormatted() {
		DateTimeFormatter dt = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		return dt.format(arrivalDate);
	}
	
	public String getDepartureDateFormatted() {
		DateTimeFormatter dt = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		return dt.format(departureDate);
	}
	
	public int getNumberOfNights(LocalDate arrivalDate, LocalDate departureDate) {
		int numberOfNights = (int) arrivalDate.until(departureDate, ChronoUnit.DAYS);
		return numberOfNights;
		}
	
	public String getPriceFormatted(double pricePerNight) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(pricePerNight);
	}
	
	public double getTotalPrice(int numberOfNights, double pricePerNight) {
		double total = pricePerNight * (double) numberOfNights;
		return total;
	}
	
	public String getTotalPriceFormatted(double totalPrice) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(totalPrice);
	}
}
