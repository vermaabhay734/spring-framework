package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Onject Creations
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();

//		Object Creation + Wiring of Dependencies
//		game is a dependency of GameRunner
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
