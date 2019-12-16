package com.forge.dream.service;

import com.forge.dream.model.Login;

public interface IProfessorService {
    Login saveLogin(Login Login);
    boolean findByEmailAndPassword(String email, String password);
    Login findByID(Long id);
}
