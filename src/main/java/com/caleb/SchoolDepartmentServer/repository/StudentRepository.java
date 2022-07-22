package com.caleb.SchoolDepartmentServer.repository;

import com.caleb.SchoolDepartmentServer.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
