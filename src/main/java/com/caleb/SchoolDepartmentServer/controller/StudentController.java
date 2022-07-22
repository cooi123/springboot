package com.caleb.SchoolDepartmentServer.controller;

import com.caleb.SchoolDepartmentServer.Entity.Student;
import com.caleb.SchoolDepartmentServer.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){

        return studentService.viewAllStudent();
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){

        return studentService.addStudent(student);
    }
}
