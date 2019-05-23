package com.example.sqlite.demosqlite.entity;

import javax.persistence.*;

@Entity
@Table(name = "albums")
public class AlbumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "albumid")
    public Integer id;

    public String title;

    @ManyToOne
    @JoinColumn(name="artistid", nullable=false)
    public ArtistEntity artist;

}
