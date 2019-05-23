package com.example.sqlite.demosqlite.web.service;

import com.example.sqlite.demosqlite.entity.AlbumEntity;
import com.example.sqlite.demosqlite.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    public AlbumRepository albumRepository;

    public List<AlbumEntity> load() {
        return this.albumRepository.findAll();
    }

    public AlbumEntity get(Integer id) {
        return this.albumRepository.findById(id).get();
    }

    public Boolean save(AlbumEntity albumEntity) {
        return this.albumRepository.save(albumEntity) != null;
    }

    public Boolean save(AlbumEntity albumEntity, Integer id) {
        albumEntity.id = id;
        return this.albumRepository.save(albumEntity) != null;
    }

    public Boolean delete(Integer id) {
        this.albumRepository.deleteById(id);
        return true;
    }
}
