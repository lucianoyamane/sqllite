package com.example.sqlite.demosqlite.Entities;

import javax.persistence.*;

@Entity
@Table(name = "artists")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artistid")
    public Integer id;

    @Column(name = "name")
    public String name;
}
