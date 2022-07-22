package com.caleb.SchoolDepartmentServer.service;

import com.caleb.SchoolDepartmentServer.Entity.Student;
import com.caleb.SchoolDepartmentServer.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> viewAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student addStudent(Student student) {
        System.out.println(student.getEmailAddress());
        return studentRepository.save(student);
    }
}
