package com.maquinadeestados.spring.desafio.enums;

public enum Options {

    OPTIONSONE("08:00"),
    OPTIONSTWO("12:00"),
    OPTIONSTHREE("13:00"),
    OPTIONSFOUR("18:00"),
    OPTIONSFIVE("22:00");

    private final String time;

    Options (String time){
        this.time = time;
    }

    public String getTime(){ return time; }

}
