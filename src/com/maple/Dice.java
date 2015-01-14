package com.maple;

import java.util.Random;

public class Dice {
	
	private int diceNumber;

	public int commonDice(){
		
		Random random = new Random();
		
		diceNumber = random.nextInt(6);		
		
		return diceNumber;
	}

}
