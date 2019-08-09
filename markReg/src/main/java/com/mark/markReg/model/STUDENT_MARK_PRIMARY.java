package com.mark.markReg.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class STUDENT_MARK_PRIMARY implements Marks{

	@Id
	private String student_id;
	private int english_mark;
	private int hindi_mark;
	private int science_mark;
	private int maths_mark;
	private int total_mark;
	private double average_mark;
	private char grade;
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public int getEnglish_mark() {
		return english_mark;
	}
	public void setEnglish_mark(int english_mark) {
		this.english_mark = english_mark;
	}
	public int getHindi_mark() {
		return hindi_mark;
	}
	public void setHindi_mark(int hindi_mark) {
		this.hindi_mark = hindi_mark;
	}
	public int getScience_mark() {
		return science_mark;
	}
	public void setScience_mark(int science_mark) {
		this.science_mark = science_mark;
	}
	public int getMaths_mark() {
		return maths_mark;
	}
	public void setMaths_mark(int maths_mark) {
		this.maths_mark = maths_mark;
	}
	public int getTotal_mark() {
		return total_mark;
	}
	public void setTotal_mark(int total_mark) {
		this.total_mark = total_mark;
	}
	public double getAverage_mark() {
		return average_mark;
	}
	public void setAverage_mark(double average_mark) {
		this.average_mark = average_mark;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}
