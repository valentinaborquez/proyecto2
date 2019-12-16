package com.forge.dream.dto;

public class ReqStudentDto {
    private Long idStudentDto;
    private Long idLoginDto;
    private String nameStudentDto;
    private String lastNameStudentDto;
    private String dniStudentDto;
    private byte activeDto;

    public ReqStudentDto(Long idStudentDto) {
        this.idStudentDto = idStudentDto;
    }

    public Long getIdStudentDto() {
        return idStudentDto;
    }

    public void setIdStudentDto(Long idStudentDto) {
        this.idStudentDto = idStudentDto;
    }

    public Long getIdLoginDto() {
        return idLoginDto;
    }

    public void setIdLoginDto(Long idLoginDto) {
        this.idLoginDto = idLoginDto;
    }

    public String getNameStudentDto() {
        return nameStudentDto;
    }

    public void setNameStudentDto(String nameStudentDto) {
        this.nameStudentDto = nameStudentDto;
    }

    public String getLastNameStudentDto() {
        return lastNameStudentDto;
    }

    public void setLastNameStudentDto(String lastNameStudentDto) {
        this.lastNameStudentDto = lastNameStudentDto;
    }

    public String getDniStudentDto() {
        return dniStudentDto;
    }

    public void setDniStudentDto(String dniStudentDto) {
        this.dniStudentDto = dniStudentDto;
    }

    public byte getActiveDto() {
        return activeDto;
    }

    public void setActiveDto(byte activeDto) {
        this.activeDto = activeDto;
    }
}
