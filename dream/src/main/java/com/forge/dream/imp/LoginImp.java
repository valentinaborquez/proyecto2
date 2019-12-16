package com.forge.dream.imp;
import com.forge.dream.model.Login;
import com.forge.dream.repository.LoginRepository;
import com.forge.dream.service.IProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginImp implements IProfessorService {

    @Autowired
    private LoginRepository LoginRepository;
    @Override
    public Login saveLogin(Login Login) {
        Login  LoginLocal = null;
        try{
           LoginLocal = LoginRepository.save(Login);

        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return LoginLocal;

    }
//
    @Override
    public boolean findByEmailAndPassword(String email, String password) {
        boolean exitsUser = false;
        Login  LoginLocal ;
        try{
            LoginLocal = LoginRepository.findByEmailAndPassword(email, password);
            exitsUser = true;

        }catch(Exception ex){
            ex.printStackTrace();
        }
        return exitsUser;
    }

    @Override
    public Login findByID(Long id) {
        Login  LoginLocal = null;
        try{

        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return LoginLocal;

    }
}

