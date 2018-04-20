package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TripManagerTest {

	@Test
	public void addTrip() {
		TripManager tripManager = new TripManager();
		Trip trip = new Trip("Wakacje", "Lato 2017");

		assertEquals(0, tripManager.getTrips().size());

		tripManager.addTrip(trip);
		assertEquals(1, tripManager.getTrips().size());
	}

	@Test
	public void removeTrip() {
		TripManager tripManager = new TripManager();
		Trip trip = new Trip("Wakacje", "Lato 2017");

		tripManager.addTrip(trip);
		assertEquals(1, tripManager.getTrips().size());

		tripManager.removeTrip(trip);
		assertEquals(0, tripManager.getTrips().size());
	}
	
	@Test
	public void findTripByName() {
		TripManager tripManager = new TripManager();
		Trip trip = new Trip("Wycieczka", "Beskidy 2018");

		tripManager.addTrip(trip);

		assertEquals(trip, tripManager.findTrip("Wycieczka"));

	}

	@Test
	public void findTripByDescription() {
		TripManager tripManager = new TripManager();
		Trip trip = new Trip("Wycieczka", "Beskidy 2018");

		tripManager.addTrip(trip);

		assertEquals(trip, tripManager.findTrip("Beskidy 2018"));

	}
	
	@Test
	public void findTripNull() {
		TripManager tripManager = new TripManager();
		Trip trip = new Trip("Wycieczka", "Beskidy 2018");

		tripManager.addTrip(trip);

		assertNull(trip);

	}
}