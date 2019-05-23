package com.example.sqlite.demosqlite.repository;

import com.example.sqlite.demosqlite.entity.AlbumEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlbumRepository extends CrudRepository<AlbumEntity, Integer> {

    List<AlbumEntity> findAll();
}
