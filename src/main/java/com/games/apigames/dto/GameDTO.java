package com.games.apigames.dto;

import com.games.apigames.model.Game;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GameDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameDTO(Game game) {
		id = game.getId();
		title = game.getTitle();
		year = game.getYear();
		imgUrl = game.getImgUrl();
		shortDescription = game.getShortDescription();
	}
}

