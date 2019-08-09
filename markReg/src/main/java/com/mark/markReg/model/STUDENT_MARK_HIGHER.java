package com.mark.markReg.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class STUDENT_MARK_HIGHER implements Marks {

	@Id
	private String student_id;
	private int english_mark;
	private int tamil_mark;
	private int physics_mark;
	private int chemistry_mark;
	private int computer_mark;
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
	public int getTamil_mark() {
		return tamil_mark;
	}
	public void setTamil_mark(int tamil_mark) {
		this.tamil_mark = tamil_mark;
	}
	public int getPhysics_mark() {
		return physics_mark;
	}
	public void setPhysics_mark(int physics_mark) {
		this.physics_mark = physics_mark;
	}
	public int getChemistry_mark() {
		return chemistry_mark;
	}
	public void setChemistry_mark(int chemistry_mark) {
		this.chemistry_mark = chemistry_mark;
	}
	public int getComputer_mark() {
		return computer_mark;
	}
	public void setComputer_mark(int computer_mark) {
		this.computer_mark = computer_mark;
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
