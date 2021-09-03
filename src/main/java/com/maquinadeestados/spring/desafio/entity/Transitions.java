package com.maquinadeestados.spring.desafio.entity;

import com.maquinadeestados.spring.desafio.enums.Options;

import javax.persistence.*;

@Entity
public class Transitions {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Options time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Options getTime() {
        return time;
    }

    public void setTime(Options time) {
        this.time = time;
    }
}
