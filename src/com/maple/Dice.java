package com.maple;

import java.util.Random;

public class Dice {
	
	private int diceNumber;

	public int rollDice(){
		
		Random random = new Random();
		
		diceNumber = random.nextInt(6);		
		
		return diceNumber;
	}
	
	public int getDiceNumber() {
		return diceNumber;
	}

	public void setDiceNumber(int diceNumber) {
		this.diceNumber = diceNumber;
	}


}
