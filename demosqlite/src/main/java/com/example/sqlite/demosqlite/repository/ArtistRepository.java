package com.example.sqlite.demosqlite.repository;

import com.example.sqlite.demosqlite.entity.ArtistEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ArtistRepository extends CrudRepository<ArtistEntity, Integer> {

    List<ArtistEntity> findAll();
}
