package com.playandvote.inventoryservice.repositories;

import com.playandvote.inventoryservice.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GameRepository extends JpaRepository<Game, UUID> {
}
