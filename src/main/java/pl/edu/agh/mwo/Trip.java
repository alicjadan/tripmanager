package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class Trip {

	public String name;
	public String description;
	
	Collection <Photo> photos = new ArrayList<Photo>();

	
	public Trip (String name, String description) {
		this.name = name;
		this.description = description;		
	}	
	
	public Collection<Photo> getPhotos() {
		return photos;
	}

	public void addPhoto(Photo photo) {
		photos.add(photo);
	}

}
