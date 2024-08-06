package com.hkm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hkm.domain.Student;
import com.hkm.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public Student getStudentById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<Student> getAllStudents() {
		return repo.findAll();
	}
	
	public void deleteStudent(Student student) {
		repo.delete(student);
	}
	
	public void deleteStudentById(int id) {
		repo.deleteById(id);
	}

	public Student save(Student student) {
		return repo.save(student);
	}
}
