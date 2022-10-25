package com.course.structure;

public class School extends Building {
	private int num_of_classrooms;
	private String grade_level;

	public School(double square_footage, int stories, int num_of_classrooms, String grade_level) {
		super(square_footage, stories);
		this.num_of_classrooms = num_of_classrooms;
		this.grade_level = new String(grade_level);
	}

	public void setNumOfClassrooms(int num_of_classrooms) {
		this.num_of_classrooms = num_of_classrooms;
	}

	public void setGradeLevel(String grade_level) {
		this.grade_level = new String(grade_level);
	}

	public int getNumOfClassrooms() {
		return this.num_of_classrooms;
	}

	public String getGradeLevel() {
		return new String(this.grade_level);
	}
}