package com.example.casinogames.service;

import com.example.casinogames.model.Game;
import com.example.casinogames.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository repository;

    public List<Game> getAllGames() {
        return repository.findAll();
    }

    public Game getGameById(String id) {
        return repository.findById(id).orElse(null);
    }

    public Game saveGame(Game game) {
        return repository.save(game);
    }

    public void deleteGame(String id) {
        repository.deleteById(id);
    }
}
