package com.maple;

public class FraudPlayer {
	
	private String name;
	private int score;
	private String diceMode="NORMAL"; 		// 어떻게 해야 좋을까?
	
	FraudDice fraudDice = new FraudDice();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getDiceMode() {
		return diceMode;
	}

	public void setDiceMode(String diceMode) {
		this.diceMode = diceMode;
	}
	
	public void setDice(){
		setScore(fraudDice.rollDice());
	}
}
