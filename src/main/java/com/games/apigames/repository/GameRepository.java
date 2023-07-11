package com.games.apigames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.games.apigames.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}
