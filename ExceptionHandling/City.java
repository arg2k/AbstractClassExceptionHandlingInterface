package ExceptionHandling;

import java.util.*;

@SuppressWarnings("serial")
class CityNotFoundException extends Exception {
	public CityNotFoundException(String message) {
		super(message);
	}

	public void printStackTrace() {
		super.printStackTrace();
		System.out.println("City not found exception occured");
	}
}

public class City {
	private Map<Integer, String> cityZipCodeMap;

	public City() {
		cityZipCodeMap = new HashMap<Integer, String>();
		cityZipCodeMap.put(11111, "Austin");
		cityZipCodeMap.put(22222, "San Diego");
		cityZipCodeMap.put(33333, "Boston");
	}

	public String findCityByZipCode(int zipCode) throws CityNotFoundException {
		if (cityZipCodeMap.containsKey(zipCode)) {
			return cityZipCodeMap.get(zipCode);
		} else {
			throw new CityNotFoundException("City not found for the given zip code");
		}
	}
}