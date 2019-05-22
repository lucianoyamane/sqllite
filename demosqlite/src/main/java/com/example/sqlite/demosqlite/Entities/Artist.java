package com.example.sqlite.demosqlite.Entities;

import javax.persistence.*;

@Entity
@Table(name = "artists")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ArtistId")
    public Integer id;

    @Column(name = "Name")
    public String name;
}
