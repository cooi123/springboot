package com.caleb.SchoolDepartmentServer.service;

import com.caleb.SchoolDepartmentServer.Entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> viewAllStudent();
    Student addStudent(Student student);
}
