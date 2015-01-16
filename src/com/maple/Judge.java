package com.maple;

import com.maple.Player;
import com.maple.FraudPlayer;
import com.maple.Recorder;

public class Judge {
	
	Player player1 = new Player();
	FraudPlayer player2 = new FraudPlayer();
	Recorder recorder = new Recorder();
	
	private int scoreOfPlayer1;
	private int scoreOfPlayer2;

	public int getScoreOfPlayer1() {
		return scoreOfPlayer1;
	}

	public void setScoreOfPlayer1(int scoreOfPlayer1) {
		this.scoreOfPlayer1 = scoreOfPlayer1;
	}

	public int getScoreOfPlayer2() {
		return scoreOfPlayer2;
	}

	public void setScoreOfPlayer2(int scoreOfPlayer2) {
		this.scoreOfPlayer2 = scoreOfPlayer2;
	}
	
	public String getPlayerName1(Player player){
		return player.getPlayerName();
	}
	
	public String getPlayerName2(FraudPlayer player){
		return player.getName();
	}
	
	public void registPlayer(String playerName1, String playerName2){		//등록 방법 확인 후 수정
		
		player1.setPlayerName(playerName1);
		player2.setName(playerName2);
	}
	
	public void gamePlay(){
		player1.setDice();
		player2.setDice();
		
		setScoreOfPlayer1(player1.getScore());
		setScoreOfPlayer2(player2.getScore());
	}
	
	public void result(){
		recorder.recordResult(player1.getPlayerName(), player2.getName(), getScoreOfPlayer1(), getScoreOfPlayer2());
	}
	
}
