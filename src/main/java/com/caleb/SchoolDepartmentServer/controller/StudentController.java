package com.caleb.SchoolDepartmentServer.controller;

import com.caleb.SchoolDepartmentServer.Entity.Student;
import com.caleb.SchoolDepartmentServer.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {

        return studentService.viewAllStudent();
    }

    @PostMapping("/student")
    public ResponseEntity<String> addStudent(@Valid @RequestBody Student student) {
        return new ResponseEntity(studentService.addStudent(student),HttpStatus.OK);
    }
}
