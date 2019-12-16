package com.forge.dream.controller;

import com.forge.dream.dto.ReqLoginDto;
import com.forge.dream.imp.LoginImp;
import com.forge.dream.imp.ProfessorImp;
import com.forge.dream.model.Login;
import com.forge.dream.model.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/login")

public class ProfessorController {

  @Autowired
    private ProfessorImp professorImp;


    @RequestMapping (method = RequestMethod.POST)
    public Professor saveProfessor(@RequestBody Professor professor){
        Professor professorController = null;
        try {
            professorController = professorImp.saveProfessor(professor);
        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return professorController ;
    }

    @RequestMapping (value = "/session", method = RequestMethod.POST)
    public boolean saveLogin(@RequestBody ReqLoginDto loginDto){
        boolean loginController = false;
        try {
            loginController = loginImp.findByEmailAndPassword(loginDto.getEmailDto(), loginDto.getPaswoordDto());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return loginController ;
    }
}
