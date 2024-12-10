package com.example.games_services_api.repository;

import com.example.games_services_api.commons.entities.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<GameModel, Long> {
}
