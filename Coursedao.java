package com.springrest.springrest.coursedao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Course;

public interface Coursedao extends JpaRepository<Course,Long> {

}
