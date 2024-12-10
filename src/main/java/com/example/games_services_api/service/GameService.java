package com.example.games_services_api.service;

import com.example.games_services_api.commons.entities.GameModel;

public interface GameService {
    GameModel createGame(GameModel gameRequest);
}
