package com.forge.dream.dto;
import java.util.Date;

public class ReqProfessorDto {

    private Long idProfessorDto;
    private Long idLoginDto;
    private String nameProfessorDto;
    private String lastNameProfessorDto;
    private String dniProfessorDto;
    private byte activeDto;



    public ReqProfessorDto(Long idProfessorDto) {
        this.idProfessorDto = idProfessorDto;
    }

    public Long getIdProfessorDto() {
        return idProfessorDto;
    }

    public void setIdProfessorDto(Long idProfessorDto) {
        this.idProfessorDto = idProfessorDto;
    }

    public Long getIdLoginDto() {
        return idLoginDto;
    }

    public void setIdLoginDto(Long idLoginDto) {
        this.idLoginDto = idLoginDto;
    }

    public String getNameProfessorDto() {
        return nameProfessorDto;
    }

    public void setNameProfessorDto(String nameProfessorDto) {
        this.nameProfessorDto = nameProfessorDto;
    }

    public String getLastNameProfessorDto() {
        return lastNameProfessorDto;
    }

    public void setLastNameProfessorDto(String lastNameProfessorDto) {
        this.lastNameProfessorDto = lastNameProfessorDto;
    }

    public String getDniProfessorDto() {
        return dniProfessorDto;
    }

    public void setDniProfessorDto(String dniProfessorDto) {
        this.dniProfessorDto = dniProfessorDto;
    }

    public byte getActiveDto() {
        return activeDto;
    }

    public void setActiveDto(byte activeDto) {
        this.activeDto = activeDto;
    }
}
