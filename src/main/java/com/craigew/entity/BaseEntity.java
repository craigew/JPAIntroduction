package com.craigew.entity;

import javax.persistence.*;

@MappedSuperclass
public class BaseEntity implements Identifier{

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="id_sequence_gen")
    @SequenceGenerator(name="id_sequence_gen", sequenceName="id_sequence")
    private long id;


    public long getId() {
        return id;
    }
}
