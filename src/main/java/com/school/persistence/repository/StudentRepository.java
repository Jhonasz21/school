package com.school.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.school.persistence.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{
	
	

}
