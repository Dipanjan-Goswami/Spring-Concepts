package com.interview.concepts.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.cache.annotation.Cacheable;

import com.interview.concepts.Model.Student;

public class APIService {
	private List<Student> studentList = Arrays.asList(
			new Student(1,"dipanjan","goswami",26),
			new Student(2, "Raju", "kapade", 25),
			new Student(3, "Bingo", "Luisee", 29),
			new Student(4, "Jack", "Snider", 30)
			);

	public List<Student> fetchStudents() throws InterruptedException{
		Thread.sleep(4000);
		return this.studentList;
	}
	
	@Cacheable(value="twenty-second-cache", key = "'StudentInCache'+#studentId", 
			condition = "#isCacheable != null && #isCacheable")
	public Optional<Student> fetchStudent(int StudentId, boolean isCacheable) throws InterruptedException {
		Thread.sleep(4000);
		return this.studentList.stream().
				filter((st) -> st.getId() == StudentId).findFirst();
	}
}
