package com.course.structure;

public class Building {
	private double square_footage;
	private int stories;

	public Building(double square_footage, int stories) {
		this.square_footage = square_footage;
		this.stories = stories;
	}

	public void setSquareFootage(double square_footage) {
		this.square_footage = square_footage;
	}

	public void setStories(int stories) {
		this.stories = stories;
	}

	public double getSquareFootage() {
		return this.square_footage;
	}

	public int getStories() {
		return this.stories;
	}
}