package com.mark.markReg.dao;

import java.util.List;
import com.mark.markReg.model.*;

import org.springframework.data.repository.CrudRepository;

public interface MarkRepository extends CrudRepository<Object,Integer> {
	
	public List<SUBJECT_INFO> findByCategory(char ch);

}
