package com.shashank.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("jump");
	}

	@Override
	public void down() {
		System.out.println("Go in to the Hole");
	}

	@Override
	public void left() {
		System.out.println("Go Back");
	}

	@Override
	public void right() {
		System.out.println("Accelerate");
	}

}
