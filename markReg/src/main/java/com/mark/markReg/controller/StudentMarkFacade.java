package com.mark.markReg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mark.markReg.dao.MarkBO;
import com.mark.markReg.dao.MarkDAO;
import com.mark.markReg.model.STUDENT_MARK_PRIMARY;


@Controller
public class StudentMarkFacade {

	//@Autowired
	private MarkBO mbo=new MarkBO();
	
	@RequestMapping("/")
	public String home() {
		return "primary.jsp";
	}
	
	@RequestMapping("/mark")
	public String studentMarkEntry(Object obj) {
			String s=mbo.studentMarkEntry(obj);
			return s;
	}
	
/*	@RequestMapping("/mark")

	public String studentMarkEntry(STUDENT_MARK_PRIMARY obj) {
			int s=mbo.insertStudentMark(obj);
			return "primary.jsp";
	}*/
}
