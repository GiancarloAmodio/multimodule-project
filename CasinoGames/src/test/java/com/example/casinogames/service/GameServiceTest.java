package com.example.casinogames.service;

import com.example.casinogames.model.Game;
import com.example.casinogames.repository.GameRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class GameServiceTest {
    @Mock
    private GameRepository repository;

    @InjectMocks
    private GameService service;

    public GameServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllGames() {
        Game game1 = new Game();
        game1.setId("1");
        game1.setName("Game 1");

        Game game2 = new Game();
        game2.setId("2");
        game2.setName("Game 2");

        List<Game> games = Arrays.asList(game1, game2);

        when(repository.findAll()).thenReturn(games);

        List<Game> result = service.getAllGames();

        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    public void testGetGameById() {
        Game game = new Game();
        game.setId("1");
        game.setName("Game 1");

        when(repository.findById("1")).thenReturn(Optional.of(game));

        Game result = service.getGameById("1");

        assertNotNull(result);
        assertEquals("Game 1", result.getName());
    }

    @Test
    public void testSaveGame() {
        Game game = new Game();
        game.setId("1");
        game.setName("Game 1");

        when(repository.save(game)).thenReturn(game);

        Game result = service.saveGame(game);

        assertNotNull(result);
        assertEquals("Game 1", result.getName());
    }

    @Test
    public void testDeleteGame() {
        doNothing().when(repository).deleteById("1");

        service.deleteGame("1");

        verify(repository, times(1)).deleteById("1");
    }
}
