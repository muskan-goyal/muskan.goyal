package com.mark.markReg.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

import com.mark.markReg.model.*;
public class MarkDAO {

	@Autowired
	private MarkRepository mark;
	
	//@Bean(name="insert")
	public int insertStudentMark(Object markVO) {
		
		int inserted=0;
		if(markVO instanceof STUDENT_MARK_PRIMARY ) {
			markVO=(STUDENT_MARK_PRIMARY)markVO;
			mark.save(markVO);
			inserted=1;
		}
		if(markVO instanceof STUDENT_MARK_SECONDARY ) {
			markVO=(STUDENT_MARK_SECONDARY)markVO;
			mark.save(markVO);
			inserted=1;
		}
		if(markVO instanceof STUDENT_MARK_HIGHER ) {
			markVO=(STUDENT_MARK_HIGHER)markVO;
			mark.save(markVO);
			inserted=1;
		}
		return inserted;
	}
	public Set<String> retrieveSubjects(char category){
		
		List<SUBJECT_INFO> suboj=mark.findByCategory(category);
		Set<String> sub=new HashSet<String>();
		for(SUBJECT_INFO s:suboj) {
			sub.add(s.getSubject_name());
		}
		return sub;
	}
}
