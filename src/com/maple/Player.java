package com.maple;

//import java.util.ArrayList;
//import java.util.List;

public class Player {
	private String playerName;
	private int score;
	
	Dice dice = new Dice();
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void setDice(){
		//int diceNumber;
		//List<Integer> score = new ArrayList<Integer>();
		
		setScore(dice.rollDice());		
		
	}
}
