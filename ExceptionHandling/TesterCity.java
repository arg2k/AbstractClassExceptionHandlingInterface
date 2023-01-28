package ExceptionHandling;

public class TesterCity {
	public static void main(String[] args) {
		City city = new City();
		try {
			String cityName = city.findCityByZipCode(11111);
			System.out.println("City name for zip code 11111: " + cityName);
		} catch (CityNotFoundException e) {
			e.printStackTrace();
		}

		
		try {
			String cityName = city.findCityByZipCode(44444);
			System.out.println("City name for zip code 44444: " + cityName);
		} catch (CityNotFoundException e) {
			e.printStackTrace();
		}
	}
}
