package com.example.learnSpringFramework.game;

import org.springframework.stereotype.Component;

@Component
public class GamerRunner {
	private GamingConsole game;
	public GamerRunner(GamingConsole game) {
		this.game = game;
	}
	
	public void run(){
		System.out.println("Running game:" + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
