package com.springrest.springrest.services;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.springrest.springrest.coursedao.Coursedao;
import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
     
	@Autowired
	private Coursedao coursedao;
//	List<Course> list;
	public CourseServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Course(145,"Java","This Course Contains Basics of java"));
//		list.add(new Course(146,"Spring","This Course Contains Basics of Spring"));
		
	}
	@Override
	public List<Course> getCourses() {
		
//		return list;
		return coursedao.findAll();
	}
	
	@Override
	public Course getCourse(long courseId) {
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
//		return c;
		return coursedao.findById(courseId).get();
		
		
		
	}
	@Override
	public Course addCourse(Course course) {
	
//		list.add(course);
		coursedao.save(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e -> {
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		coursedao.save(course);
		return course;
	}
	@Override
	public void deleteCourse(long parseLong) {
		
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=coursedao.findById(parseLong).get();
		coursedao.delete(entity);
	}

}
