package com.example.games_services_api.service.impl;

import com.example.games_services_api.commons.entities.GameModel;
import com.example.games_services_api.repository.GameRepository;
import com.example.games_services_api.service.GameService;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class GameServiceImpl implements GameService {
    private final GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    @Override
    public GameModel createGame(GameModel gameRequest) {
        return Optional.of(gameRequest)
                .map(this::mapToEntity)
                .map(gameRepository::save)
                .orElseThrow(() -> new RuntimeException("Error creating game"));
    }

    private GameModel mapToEntity(GameModel gameRequest) {
        return GameModel.builder()
                .name(gameRequest.getName())
                .build();
    }
}
