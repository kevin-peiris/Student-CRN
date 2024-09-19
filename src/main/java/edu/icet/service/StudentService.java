package edu.icet.service;

import edu.icet.model.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);

    List<Student> findByName(String name);

    List<Student> getStudents();

    void deleteStudent(Integer id);
}
