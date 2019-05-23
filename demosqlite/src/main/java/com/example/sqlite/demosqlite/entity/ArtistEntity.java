package com.example.sqlite.demosqlite.entity;

import javax.persistence.*;

@Entity
@Table(name = "artists")
public class ArtistEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artistid")
    public Integer id;

    public String name;
}
