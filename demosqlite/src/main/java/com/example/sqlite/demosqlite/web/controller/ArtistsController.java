package com.example.sqlite.demosqlite.web.controller;

import com.example.sqlite.demosqlite.Entities.Artist;
import com.example.sqlite.demosqlite.web.service.ArtistsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistsController {

    @Autowired
    public ArtistsService artistsService;

    @GetMapping("/load")
    public List<Artist> load() {
        return this.artistsService.load();
    }
}
