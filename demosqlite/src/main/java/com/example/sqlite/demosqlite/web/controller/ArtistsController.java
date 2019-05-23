package com.example.sqlite.demosqlite.web.controller;

import com.example.sqlite.demosqlite.Entities.Artist;
import com.example.sqlite.demosqlite.web.service.ArtistsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtistsController {

    @Autowired
    public ArtistsService artistsService;

    @GetMapping("/")
    public List<Artist> load() {
        return this.artistsService.load();
    }

    @GetMapping("/{id}")
    public Artist get(@PathVariable("id") Integer id) {
        return this.artistsService.get(id);
    }

    @PostMapping("/")
    public Boolean insert(@RequestBody Artist body) {
        return this.artistsService.save(body);
    }

    @PutMapping("/{id}")
    public Boolean update(@RequestBody Artist body, @PathVariable("id") Integer id ) {
        return this.artistsService.save(body, id);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable("id") Integer id ) {
        return this.artistsService.delete(id);
    }

}
