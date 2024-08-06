package com.hkm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hkm.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{	

}
