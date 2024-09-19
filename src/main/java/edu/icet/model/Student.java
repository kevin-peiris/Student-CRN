package edu.icet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String address;
    private Integer age;
    private Integer grade;
    private String guardianName;
    private String guardianContact;

    @Lob
    @Column(name = "image", columnDefinition = "LONGTEXT")
    private String image;


}
