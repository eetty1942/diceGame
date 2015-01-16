package com.maple;

import java.util.Random;

public class FraudDice {

	private int diceNumber;
	public Random random = new Random();

	
	public int getDiceNumber() {
		return diceNumber;
	}

	public void setDiceNumber(int diceNumber) {
		this.diceNumber = diceNumber;
	}
	
	public int rollDice(){
		
		int modeNumber;
		
		diceNumber = random.nextInt(6);	
		modeNumber = weakMode(diceNumber);
		modeNumber = strongMode(diceNumber);
		if(modeNumber > diceNumber){
			diceNumber = modeNumber;
		}
		return diceNumber;
	}
	
	public int weakMode(int diceNumber){		

		diceNumber = 0 ;

		if(diceNumber >= 5){
			diceNumber = random.nextInt(6);
		}
		return diceNumber;
	}
	
	public int strongMode(int diceNumber){	
		
		diceNumber = 0 ;

		if(diceNumber <= 2){
			diceNumber = random.nextInt(6);
		}
		return diceNumber;
	}
	
}
