package ru.temen.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.temen.domain.Student;
import ru.temen.service.StudentRepo;

/**
 * Created by temen on 09.02.17.
 */
@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @RequestMapping("/hello")
    public String hello(){
        return "Hey there!";
    }

    @RequestMapping("/students")
    public Iterable<Student> allStudents(){
        return studentRepo.findAll();
    }
}
