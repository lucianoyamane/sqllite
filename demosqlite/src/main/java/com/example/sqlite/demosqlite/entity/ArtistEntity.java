package com.example.sqlite.demosqlite.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "artists")
public class ArtistEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artistid")
    public Integer id;

    public String name;

    @OneToMany
    @JoinColumn(name= "artistid")
    public List<AlbumEntity> albums;
}
