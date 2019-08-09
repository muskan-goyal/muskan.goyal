package com.mark.markReg.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.mark.markReg.model.*;

public class MarkBO {
	
	
	@Autowired
	MarkDAO rep;
	
	public String studentMarkEntry(Object ob) {
		MarkBO obj = new MarkBO();
		if(ob instanceof STUDENT_MARK_PRIMARY)
		{
			STUDENT_MARK_PRIMARY p=(STUDENT_MARK_PRIMARY)ob;
			if((p.getEnglish_mark()<0||p.getEnglish_mark()>100)||(p.getHindi_mark()<0||p.getHindi_mark()>100)||(p.getMaths_mark()<0||p.getMaths_mark()>100)||(p.getScience_mark()<0||p.getScience_mark()>100)) {
				return "error.html";
			}
			else {
				int total=p.getEnglish_mark()+p.getHindi_mark()+p.getScience_mark()+p.getMaths_mark();
				int avg = total/4;
				p.setTotal_mark(total);
				p.setAverage_mark(avg);
                p.setGrade(obj.calGrade(avg));
				int success=rep.insertStudentMark(p);
				if(success==1)
					return "success.html";
				else
					return "error.html";
			}
		}
		else if(ob instanceof STUDENT_MARK_SECONDARY)
		{
			STUDENT_MARK_SECONDARY s=(STUDENT_MARK_SECONDARY)ob;
			if((s.getEnglish_mark()<0||s.getEnglish_mark()>100)||(s.getHindi_mark()<0||s.getHindi_mark()>100)||(s.getMaths_mark()<0||s.getMaths_mark()>100)||(s.getScience_mark()<0||s.getScience_mark()>100)||(s.getSocial_mark()<0||s.getSocial_mark()>100)) {
				return "error.html";
			}
			else {
				int total=s.getEnglish_mark()+s.getHindi_mark()+s.getScience_mark()+s.getMaths_mark()+s.getSocial_mark();
				int avg = total/5;
				s.setTotal_mark(total);
				s.setAverage_mark(avg);
                s.setGrade(obj.calGrade(avg));
				int success=rep.insertStudentMark(s);
				if(success==1)
					return "success.html";
				else
					return "error.html";
			}
		}
		if(ob instanceof STUDENT_MARK_HIGHER)
		{
			STUDENT_MARK_HIGHER h=(STUDENT_MARK_HIGHER)ob;
			if((h.getEnglish_mark()<0||h.getEnglish_mark()>100)||(h.getPhysics_mark()<0||h.getPhysics_mark()>100)||(h.getMaths_mark()<0||h.getMaths_mark()>100)||(h.getChemistry_mark()<0||h.getChemistry_mark()>100)||(h.getComputer_mark()<0||h.getComputer_mark()>100)) {
				return "error.html";
			}
			else {
				int total=h.getEnglish_mark()+h.getPhysics_mark()+h.getChemistry_mark()+h.getMaths_mark()+h.getComputer_mark()+h.getTamil_mark();
				int avg = total/6;
				h.setTotal_mark(total);
				h.setAverage_mark(avg);
                h.setGrade(obj.calGrade(avg));
				int success=rep.insertStudentMark(h);
				if(success==1)
					return "success.html";
				else
					return "error.html";
			}
		}
		return null;
	}
	public char calGrade(int avg) {
		
		char ch=' ';
		if(avg>90) {
			ch='A';
		}else if(avg<=89&&avg>=70) {
			ch='B';
		}
		else if(avg<=69&&avg>=50) {
			ch='C';
		}
		else if(avg<50) {
			ch='F';
		}
		return ch;	
	}

}
