package com.forge.dream.mapping;

import com.forge.dream.dto.ReqProfessorDto;
import com.forge.dream.dto.ResponseProfessorDto;
import com.forge.dream.model.Login;
import com.forge.dream.model.Professor;
import com.forge.dream.model.Student;
import org.springframework.stereotype.Service;

@Service
public class MappingObjetosProfessor {

    public Professor transformDtoIntoModel(ReqProfessorDto persona, Login login, Student student) throws Exception {
        Professor professorLocal = null;
        try {
            professorLocal = new Professor();
            ReqProfessorDto professor = null;
            professorLocal.setId();(Professor.getIdProfessorDto());
            professorLocal.setLogin(login);
            professorLocal.setStudent(student);
            professorLocal.setName(professor.getNameProfessorDto().toUpperCase());
            professorLocal.setLastName(persona.getLastNameProfessorDto().toUpperCase());
            professorLocal.setDni(professor.getDniProfessorDto());

        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return professorLocal;
    }

    public ResponseProfessorDto transformModelIntoDtoResponse(professor professorLocal) throws Exception {
        ResponseProfessorDto personaDto = null;
        try {
            professorDto = new ResponseProfessorDto();
            professorDto.setEmailLoginDto(professorLocal.getLogin().getEmail());
            professorDto.setFechaCreacionPersonaDto(professorLocal.getFechaCreacion());
            professor.setNameProfessorDto(professorLocal.getNameProfessor());
            professorDto.setStudentDto(professorLocal.getStudent().getTipo());
            professorDto.setLastNameProfessorDto(professorLocal.getApellidoPersona());
            professorDtosetRutPersonaDto(professorLocal.getRutPersona());

        }catch (Exception ex){
            ex.printStackTrace();
            throw new Exception(Constant.ERROR_SISTEMA);
        }
        return professorDto;
    }
}
