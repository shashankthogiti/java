package com.shashank.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shashank.learnspringframework.game.GameRunner;
import com.shashank.learnspringframework.game.GamingConsole;

@Configuration
@ComponentScan("com.shashank.learnspringframework.game")
public class App03GamingSpringBeans {



	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {

			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();

		}

		// var game = new MarioGame();
		// var game = new SuperContraGame();
		// var game = new PacManGame();
		// var gameRunner = new GameRunner(game);
		// gameRunner.run();

	}

}
