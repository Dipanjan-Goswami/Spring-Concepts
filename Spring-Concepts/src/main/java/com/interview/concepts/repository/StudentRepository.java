package com.interview.concepts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.interview.concepts.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	/* Alternative of DAO classes
	 * translate all types of exception into SpringdataException 
	 * exceptions can be checked/unchecked
	 */
	@Procedure(procedureName = "GET_AGE", outputParameterName = "AGE")
	public int getAge(int id);
}
