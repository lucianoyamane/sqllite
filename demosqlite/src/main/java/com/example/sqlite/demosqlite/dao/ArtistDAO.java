package com.example.sqlite.demosqlite.dao;

import com.example.sqlite.demosqlite.Entities.Artist;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ArtistDAO extends CrudRepository<Artist, Integer> {

    List<Artist> findAll();
}
