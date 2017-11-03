package com.example.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.StudentModel;

@Repository
public interface StudentDAO {

	StudentModel selectStudent(String npm);

	List<StudentModel> selectAllStudents();

	void deleteStudent(String npm);

	void updateStudent(StudentModel student);
}