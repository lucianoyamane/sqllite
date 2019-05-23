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
        return this.artistDAO.findAll();
    }

    public Artist get(Integer id) {
        return this.artistDAO.findById(id).get();
    }

    public Boolean save(Artist artist) {
        return this.artistDAO.save(artist) != null;
    }

    public Boolean save(Artist artist, Integer id) {
        artist.id = id;
        return this.artistDAO.save(artist) != null;
    }

    public Boolean delete(Integer id) {
        this.artistDAO.deleteById(id);
        return true;
    }
}
