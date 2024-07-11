package com.example.casinogames.controller;

import com.example.casinogames.model.Game;
import com.example.casinogames.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {
    @Autowired
    private GameService service;

    @GetMapping
    public List<Game> getAllGames() {
        return service.getAllGames();
    }

    @GetMapping("/{id}")
    public Game getGameById(@PathVariable String id) {
        return service.getGameById(id);
    }

    @PostMapping
    public Game createGame(@RequestBody Game game) {
        return service.saveGame(game);
    }

    @PutMapping("/{id}")
    public Game updateGame(@PathVariable String id, @RequestBody Game game) {
        game.setId(id);
        return service.saveGame(game);
    }

    @DeleteMapping("/{id}")
    public void deleteGame(@PathVariable String id) {
        service.deleteGame(id);
    }
}
