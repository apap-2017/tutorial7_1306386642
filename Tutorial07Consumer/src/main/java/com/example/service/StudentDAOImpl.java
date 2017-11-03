package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dao.StudentDAO;
import com.example.model.StudentModel;

@Service
@Repository 
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public StudentModel selectStudent(String npm) {
		StudentModel student = restTemplate.getForObject("http://localhost:8080/rest/student/view/" + npm,
				StudentModel.class);
		return student;
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		ResponseEntity<StudentModel[]> responseEntity = restTemplate.getForEntity("http://localhost:8080/rest/student/viewall", StudentModel[].class);
		return Arrays.asList(responseEntity.getBody());
	}

	@Override
	public void deleteStudent(String npm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(StudentModel student) {
		// TODO Auto-generated method stub
		
	}
}