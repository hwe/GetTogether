package de.tu_dresden.gettogether.domain;

/**
 * @author Markus Frank 
 * 
 * Class that represents a location with latitude and altitude 
 *
 */

public class Place {
	
	private double altitude;
	private double latitude;
	
	
	/**
	 * Create a new Place with to Coordinates
	 * 
	 * @param latitude
	 * @param altitude
	 */
	
	public Place(long latitude, long altitude){
		this.altitude = altitude;
		this.latitude = latitude;
	}

	public double getAltitude() {
		return altitude;
	}

	public double getLatitude() {
		return latitude;
	}
	
	
}
