package com.graphql.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.demo.entity.Student;

public interface RtRepo extends JpaRepository<Student, Integer> {
	List<Student> findByBranch(String branch);

}
