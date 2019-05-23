package com.example.sqlite.demosqlite.web.service;

import com.example.sqlite.demosqlite.entity.ArtistEntity;
import com.example.sqlite.demosqlite.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    @Autowired
    public ArtistRepository artistRepository;

    public List<ArtistEntity> load() {
        return this.artistRepository.findAll();
    }

    public ArtistEntity get(Integer id) {
        return this.artistRepository.findById(id).get();
    }

    public Boolean save(ArtistEntity artistEntity) {
        return this.artistRepository.save(artistEntity) != null;
    }

    public Boolean save(ArtistEntity artistEntity, Integer id) {
        artistEntity.id = id;
        return this.artistRepository.save(artistEntity) != null;
    }

    public Boolean delete(Integer id) {
        this.artistRepository.deleteById(id);
        return true;
    }
}
