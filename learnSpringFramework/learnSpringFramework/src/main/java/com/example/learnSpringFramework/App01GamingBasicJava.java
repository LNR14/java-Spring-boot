package com.example.learnSpringFramework;

import com.example.learnSpringFramework.game.GamerRunner;
import com.example.learnSpringFramework.game.MarioGame;
import com.example.learnSpringFramework.game.PacManeGamer;
import com.example.learnSpringFramework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Game runner class instance 
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacManeGamer();  // 1: Object creation
		var gameRunner = new GamerRunner(game); 
		  //2:Object creation + Wiring of dependencies
		  // Game is a dependency of a GameRunner 
		gameRunner.run();
		
		

	}

}
