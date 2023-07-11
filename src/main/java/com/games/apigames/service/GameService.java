package com.games.apigames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.games.apigames.dto.GameDTO;
import com.games.apigames.model.Game;
import com.games.apigames.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	
	public List<GameDTO> buscarTodos(){
		List<Game> dto = gameRepository.findAll();
		return dto.stream().map(GameDTO::new).toList();
		
	}
}
