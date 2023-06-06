package com.example.learnSpringFramework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.learnSpringFramework.game.GamerRunner;
import com.example.learnSpringFramework.game.GamingConsole;
import com.example.learnSpringFramework.game.MarioGame;
import com.example.learnSpringFramework.game.PacManeGamer;
import com.example.learnSpringFramework.game.SuperContraGame;

@Configuration
@ComponentScan("com.example.learnSpringFramework.game")
public class App03GamingSpringBeans {


	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(App03GamingSpringBeans.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GamerRunner.class).run();
		}
	}
}