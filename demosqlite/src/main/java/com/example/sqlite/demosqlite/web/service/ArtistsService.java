package com.example.sqlite.demosqlite.web.service;

import com.example.sqlite.demosqlite.Entities.Artist;
import com.example.sqlite.demosqlite.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistsService {

    @Autowired
    public ArtistRepository artistRepository;

    public List<Artist> load() {
        return this.artistRepository.findAll();
    }

    public Artist get(Integer id) {
        return this.artistRepository.findById(id).get();
    }

    public Boolean save(Artist artist) {
        return this.artistRepository.save(artist) != null;
    }

    public Boolean save(Artist artist, Integer id) {
        artist.id = id;
        return this.artistRepository.save(artist) != null;
    }

    public Boolean delete(Integer id) {
        this.artistRepository.deleteById(id);
        return true;
    }
}
