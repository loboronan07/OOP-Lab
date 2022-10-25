package com.course.structure;

public class House extends Building {
	private int num_of_bedrooms;
	private int num_of_baths;

	public House(double square_footage, int stories, int num_of_bedrooms, int num_of_baths) {
		super(square_footage, stories);
		this.num_of_bedrooms = num_of_bedrooms;
		this.num_of_baths = num_of_baths;
	}

	public void setNumOfBedrooms(int num_of_bedrooms) {
		this.num_of_bedrooms = num_of_bedrooms;
	}

	public void setNumOfBaths(int num_of_baths) {
		this.num_of_baths = num_of_baths;
	}

	public int getNumofBedrooms() {
		return this.num_of_bedrooms;
	}

	public int getNumofBaths() {
		return this.num_of_baths;
	}
}