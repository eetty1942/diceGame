package com.maple;

import java.util.ArrayList;
import java.util.List;

public class Recorder {
	
	private List<Integer> playerList1 = new ArrayList<Integer>();
	private List<Integer> playerList2 = new ArrayList<Integer>();
	
	public int sumOfPlayer1 = 0;
	public int sumOfPlayer2 = 0;
	private String playerName1;
	private String playerName2;
	private int sumOfScore1;
	private int sumOfScore2;
	
	public String getPlayerName1() {
		return playerName1;
	}

	public void setPlayerName1(String playerName1) {
		this.playerName1 = playerName1;
	}

	public String getPlayerName2() {
		return playerName2;
	}

	public void setPlayerName2(String playerName2) {
		this.playerName2 = playerName2;
	}

	public int getSumOfScore1() {
		return sumOfScore1;
	}

	public void setSumOfScore1(int sumOfScore1) {
		this.sumOfScore1 = sumOfScore1;
	}

	public int getSumOfScore2() {
		return sumOfScore2;
	}

	public void setSumOfScore2(int sumOfScore2) {
		this.sumOfScore2 = sumOfScore2;
	}
	
	public void printResult(List<Integer> playerList1, List<Integer> playerList2) {
		setSumOfScore1(0);
		setSumOfScore2(0);
		
		for(int i=0; i < playerList1.size(); i++){
			setSumOfScore1(getSumOfScore1() + playerList1.get(i));
			setSumOfScore2(getSumOfScore2() + playerList2.get(i));
		}
		
		System.out.println("["+getPlayerName1()+" : "+"["+getSumOfScore1()+"]"+getPlayerName2()+" : ["+"] "+getSumOfScore2()+"]");	 
	}

	public void recordResult(String playerName1, String playerName2, int playerScore1, int playerScore2) {
		
		setPlayerName1(playerName1);
		setPlayerName2(playerName2);
		
		playerList1.add(playerScore1);
		playerList2.add(playerScore2);
		
		printResult(playerList1, playerList2);
	}
}
