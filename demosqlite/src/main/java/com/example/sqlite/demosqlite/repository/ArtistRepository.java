package com.example.sqlite.demosqlite.repository;

import com.example.sqlite.demosqlite.Entities.Artist;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ArtistRepository extends CrudRepository<Artist, Integer> {

    List<Artist> findAll();
}
