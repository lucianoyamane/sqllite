package com.example.sqlite.demosqlite.web.controller;

import com.example.sqlite.demosqlite.entity.AlbumEntity;
import com.example.sqlite.demosqlite.web.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumController {

//    @Autowired
//    public AlbumService albumService;
//
//    @GetMapping("/")
//    public List<AlbumEntity> load() {
//        return this.albumService.load();
//    }
//
//    @GetMapping("/{id}")
//    public AlbumEntity get(@PathVariable("id") Integer id) {
//        return this.albumService.get(id);
//    }
//
//    @PostMapping("/")
//    public Boolean insert(@RequestBody AlbumEntity body) {
//        return this.albumService.save(body);
//    }
//
//    @PutMapping("/{id}")
//    public Boolean update(@RequestBody AlbumEntity body, @PathVariable("id") Integer id ) {
//        return this.albumService.save(body, id);
//    }
//
//    @DeleteMapping("/{id}")
//    public Boolean delete(@PathVariable("id") Integer id ) {
//        return this.albumService.delete(id);
//    }
}
