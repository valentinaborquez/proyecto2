package com.forge.dream.repository;

import com.forge.dream.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends JpaRepository<Login, Long> {
    Login findByEmailAndPassword(String email, String password);


}
