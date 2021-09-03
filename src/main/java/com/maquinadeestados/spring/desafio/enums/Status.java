package com.maquinadeestados.spring.desafio.enums;

public enum Status {

    ACORDADO("Acordado"),
    TRABALHANDO("Trabalhando"),
    DESCANSANDO("Descansando"),
    DORMINDO("Dormindo");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
