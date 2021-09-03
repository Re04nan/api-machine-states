package com.maquinadeestados.spring.desafio.entity;

import com.maquinadeestados.spring.desafio.enums.Status;
import javax.persistence.*;
import java.util.List;

@Entity
public class States {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Transitions> times;

    public List<Transitions> getTimes() {
        return times;
    }

    public void setTimes(List<Transitions> times) {
        this.times = times;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
