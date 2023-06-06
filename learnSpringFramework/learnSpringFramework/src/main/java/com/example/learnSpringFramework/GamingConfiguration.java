package com.example.learnSpringFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.learnSpringFramework.game.GamerRunner;
import com.example.learnSpringFramework.game.GamingConsole;
import com.example.learnSpringFramework.game.PacManeGamer;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacManeGamer();
		return game;
	}
	
	@Bean
	public GamerRunner gameRunner(GamingConsole game) {
		var gameRunner = new GamerRunner(game);
		return gameRunner;
		
	}
	
}
