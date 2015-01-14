package com.maple;

import java.util.Scanner;

public class Judge {

	Scanner scanner = new Scanner(System.in);
	
	public int registPlayer(String playerName1, String playerName2){
		
		// 선수 등록 저장
		
		int playCount;
		
		System.out.println("주사위 굴림 횟수 입력 (최대 5회) : ");
		playCount = scanner.nextInt();
		
		return playCount;
	}
	
}
