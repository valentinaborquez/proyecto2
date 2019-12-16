package com.forge.dream.model;


import com.forge.dream.service.IStudentService;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "student")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Student;
    @OneToOne // indica relacion uno a uno y el joinColumn el nombbre exacto de la columna
    @JoinColumn(name = "id_student", updatable = false, nullable = false)
    private Student student;
    @OneToOne
    @JoinColumn(name = "student", updatable = false, nullable = false)
    private IStudentService;
    @Column(name = "name_student", nullable = false)
    private String nameStudent;s
    @Column(lastName = "lastName_student", nullable = false)
    private String lastName_student;
    @Column(dni = "dni_student", nullable = false,unique = true)
    private String dniStudent;
    private Student student;


    public Long getStudent() {
        return getStudent();
    }

    public void setStudent(Long student) {
        this.student = student;
    }

    public Student getStudent() {
        return Student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student= student;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getLastName_student() {
        return lastName_student;
    }

    public void setLastName_student(String lastName_student) {
        this.lastName_student= lastName_student;
    }

    public String getDniStudent() {
        return dniStudent;
    }

    public void setDniStudent(String dniStudent) {
        this.dniStudent = dniStudent;
    }


}
