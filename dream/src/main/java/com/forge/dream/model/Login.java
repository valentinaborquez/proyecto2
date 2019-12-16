package com.forge.dream.model;

import javax.persistence.*;
/**
 * Se declaran anotaciones de persistencia JPA, Entity declara que es una entidad, Table declara que sera una tabla de datos.
*/
@Entity
@Table(name = "Login")
public class Login {
    /**
     * Anotacion @Id para declarar Primary Key, @Column para asignar nombre a la columna, @GeneratedValue para que sea autoincrementable.
     */
    @Id
    @Column(name = "id_login")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

    @Column(name = "email", unique = true, nullable = false)
        private String email;

    @Column(name = "password", nullable = false)
        private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password){
        this.password = password;

    }

    public Login() {
    }

}
