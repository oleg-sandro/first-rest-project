package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "dictionary")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="discriminator", discriminatorType=DiscriminatorType.STRING, length=15)
public abstract class Dictionary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "ext_id")
    private Integer ext_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExt_id() {
        return ext_id;
    }

    public void setExt_id(Integer ext_id) {
        this.ext_id = ext_id;
    }
}
