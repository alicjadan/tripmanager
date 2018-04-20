package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PhotoTest {

	@Test
	public void testPhoto() {
	
	Photo photo = new Photo ("2015");
	assertEquals("2015", photo.comment);
		
	}

}
