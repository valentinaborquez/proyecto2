package com.forge.dream.controller;

import com.forge.dream.dto.ReqLoginDto;
import com.forge.dream.imp.LoginImp;
import com.forge.dream.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/login")
public class LoginController {

    @Autowired
    private LoginImp loginImp;

   @RequestMapping (method = RequestMethod.POST)
    public Login saveLogin(@RequestBody Login login){
        Login loginController = null;
        try {
            loginController = loginImp.saveLogin(login);
        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return loginController ;
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
