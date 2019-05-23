package com.example.sqlite.demosqlite.web.controller;

import com.example.sqlite.demosqlite.entity.ArtistEntity;
import com.example.sqlite.demosqlite.web.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artistEntity")
public class ArtistController {

    @Autowired
    public ArtistService artistService;

    @GetMapping("/")
    public List<ArtistEntity> load() {
        return this.artistService.load();
    }

    @GetMapping("/{id}")
    public ArtistEntity get(@PathVariable("id") Integer id) {
        return this.artistService.get(id);
    }

    @PostMapping("/")
    public Boolean insert(@RequestBody ArtistEntity body) {
        return this.artistService.save(body);
    }

    @PutMapping("/{id}")
    public Boolean update(@RequestBody ArtistEntity body, @PathVariable("id") Integer id ) {
        return this.artistService.save(body, id);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable("id") Integer id ) {
        return this.artistService.delete(id);
    }

}
