package ex2;

public class ApplicationHotel {

	public static void main(String[] args) {
		
		HotelCinqEtoiles hotel5 = new HotelCinqEtoiles();
		
		hotel5.setTypeDePiscine("couverte");
		hotel5.setTaillePiscine("10 x 5");
		hotel5.setCascade(1);
		
		hotel5.descriptionPiscineLuxe();  
		
		HotelSeptEtoiles hotel7 = new HotelSeptEtoiles();
		
		hotel7.setPrixCourseTaxi(130.55);
		hotel7.setTypeDeVehicule("une limousine");
		hotel7.setCouleurVehicule("noire");
		
		hotel7.reserverTaxiLuxe();

	}

}