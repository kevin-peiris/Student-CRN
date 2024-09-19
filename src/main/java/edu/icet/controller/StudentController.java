package edu.icet.controller;

import edu.icet.model.Student;
import edu.icet.service.impl.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class StudentController {

    final StudentServiceImpl service;

    @PostMapping
    public void addStudent(@RequestBody Student student){
        System.out.println(student+" Recieved!!!");
        service.addStudent(student);
    }

    @GetMapping("/{name}")
    public List<Student> findByName(@PathVariable String name){
        return service.findByName(name);
    }

    @PutMapping("/{update}")
    public void updateStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id){
        service.deleteStudent(id);
    }

    @GetMapping
    public List<Student> getStudent(){
        return service.getStudents();
    }
}
