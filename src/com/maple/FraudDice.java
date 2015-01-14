package com.maple;

public class FraudDice {

	private int diceNumber;
	
	Dice dice = new Dice();
	
	public int normalMode(){
		diceNumber = dice.commonDice();
		return diceNumber;
	}
	
	public int weakMode(){		// 구조 수정 필요
		int fraudNumber;
		diceNumber = dice.commonDice();
		if(diceNumber >= 5){
			dice.commonDice();
		}

		return diceNumber;
	}
	
	public int strongMode(){	// 구조 수정 필요
		diceNumber = dice.commonDice();
		if(diceNumber <= 2){
			dice.commonDice();
		}
		return diceNumber;
	}
	
}
