package com.example.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.CourseModel;

@Repository 
public interface CourseDAO {
	CourseModel selectCourse (String id_course);
	List<CourseModel> selectAllCourse();
}
