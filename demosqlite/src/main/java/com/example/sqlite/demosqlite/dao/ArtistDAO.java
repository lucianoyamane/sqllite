package com.example.sqlite.demosqlite.dao;

import com.example.sqlite.demosqlite.Entities.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistDAO extends CrudRepository<Artist, Integer> {
}
