package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TripTest {
	
	@Test
	public void addPhoto() {
		Trip trip = new Trip("Wakacje", "Lato 2017");
		Photo photo = new Photo("2015");
		
		assertEquals(0, trip.getPhotos().size());
		
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());
	}
	
}
