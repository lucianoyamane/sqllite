package com.example.sqlite.demosqlite.web.service;

import com.example.sqlite.demosqlite.Entities.Artist;
import com.example.sqlite.demosqlite.dao.ArtistDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistsService {

    @Autowired
    public ArtistDAO artistDAO;

    public List<Artist> load() {
        List<Artist> artists = new ArrayList<>();
        Artist artist = new Artist();
        artist.id = 1;
        artist.name = "Teste";
        artists.add(artist);
        return artists;
    }
}
