package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class TripManager {

	Collection<Trip> trips = new ArrayList<Trip>();

	public void addTrip(Trip trip) {
		trips.add(trip);
	}

	public void removeTrip(Trip trip) {
		trips.remove(trip);
	}

	public Collection<Trip> getTrips() {
		return trips;
	}

	public Trip findTrip (String keyword) {
		
		for (Trip trip:trips)
			if (trip.name.equals(keyword) || trip.description.equals(keyword))
				return trip;		
				
			else 
				return null;				
	}


}
	