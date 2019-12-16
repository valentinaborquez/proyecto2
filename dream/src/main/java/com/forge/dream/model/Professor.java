package com.forge.dream.model;

import com.forge.dream.service.IProfessorService;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "professor")
public class Professor {

    @Id
    @Column(name = "professor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Professor;
    @OneToOne // indica relacion uno a uno y el joinColumn el nombbre exacto de la columna
    @JoinColumn(name = "id_login", updatable = false, nullable = false)
    private Login login;
    @OneToOne
    @JoinColumn(name = "id_professor", updatable = false, nullable = false)
    private IProfessorService;
    @Column(name = "name_professor", nullable = false)
    private String nameProfessor;s
    @Column(lastName = "lastName_professor", nullable = false)
    private String lastName_Professor;
    @Column(dni = "dni_professor", nullable = false,unique = true)
    private String dniProfessor;
    private Professor professor;


    public Long getProfessor() {
        return getProfessor();
    }

    public void setIdProfessor(Long idProfessor) {
        this.idProfessor = idProfessor;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor= professor;
    }

    public String getNameProfessor() {
        return nameProfessor;
    }

    public void setNameProfessor(String nameProfessor) {
        this.nameProfessor = nameProfessor;
    }

    public String getLastName_Professor() {
        return lastName_Professor;
    }

    public void setLastName_Professor(String lastName_Professor) {
        this.lastName_Professor= lastName_Professor;
    }

    public String getDniProfessor() {
        return dniProfessor;
    }

    public void setDniProfessor(String dniProfessor) {
        this.dniProfessor = dniProfessor;
    }


}
