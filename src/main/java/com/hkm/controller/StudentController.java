package com.hkm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hkm.domain.Student;
import com.hkm.service.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	private final static ObjectMapper MAPPER = new ObjectMapper();

	@GetMapping(value = "/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}
	
	@GetMapping(value = "/all")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@PostMapping(value = "/save")
	public Student updateStudent(@RequestBody Student student) {
		return service.save(student);
	}
	
	@PostMapping(value = "/delete")
	public void deleteStudent(@RequestBody Student student) {
		//delete happens based on the studentId and addressId, other field details doesn't matter
		service.deleteStudent(student);
	}
	
	@GetMapping(value = "/delete/{id}")
	public void deleteStudent(@PathVariable("id") int studentId) {
		service.deleteStudentById(studentId);
	}

}
