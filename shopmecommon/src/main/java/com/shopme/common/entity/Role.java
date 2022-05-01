package com.shopme.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "roles")
@Data
public class Role {

    public Role(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Role(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 40, nullable = false, unique = true)
    private String name;

    @Column(length = 150, nullable = false)
    private String description;
}

