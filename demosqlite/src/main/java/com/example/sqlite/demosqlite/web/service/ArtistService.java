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
        return this.artistRepository.load();
    }

    public ArtistEntity get(Integer id) {
        return this.artistRepository.get(id);
    }

    public Boolean save(ArtistEntity artistEntity) {
        return this.artistRepository.save(artistEntity);
    }

    public Boolean save(ArtistEntity artistEntity, Integer id) {
        return this.artistRepository.update(artistEntity, id);
    }

    public Boolean delete(Integer id) {
        this.artistRepository.delete(id);
        return true;
    }
}
