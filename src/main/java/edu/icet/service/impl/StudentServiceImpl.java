package edu.icet.service.impl;

import edu.icet.model.Student;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    StudentRepository repository;

    @Override
    public void addStudent(Student student) {
        repository.save(student);
    }

    @Override
    public List<Student> getStudents() {
        List<Student> list=repository.findAll();
        return list;
    }

    @Override
    public void deleteStudent(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Student> findByName(String name) {
        return repository.findByName(name);
    }


}
