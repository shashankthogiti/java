package com.shashank.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shashank.learnspringframework.game.GameRunner;
import com.shashank.learnspringframework.game.GamingConsole;
import com.shashank.learnspringframework.game.PacManGame;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
	@Bean
	public GameRunner game(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
	// var game = new MarioGame();
			// var game = new SuperContraGame();
	//var game = new PacManGame();
//	var gameRunner = new GameRunner(game);
	//gameRunner.run();

}
