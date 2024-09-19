package edu.icet.repository;

import edu.icet.model.Student;
import org.springframework.boot.json.JsonParser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findByName(String name);
}
