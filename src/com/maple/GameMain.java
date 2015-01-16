package com.maple;

import java.util.Scanner;
import com.maple.Judge;

public class GameMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Judge judge = new Judge();
		
		String playerName1;
		String playerName2;
		int count;
		int index = 0;
		
		System.out.println("주사위 게임\n");
		System.out.println("플레이어 1의 이릅을 쓰세요 : ");
		playerName1 = scanner.next();
		
		System.out.println("플레이어 2의 이릅을 쓰세요 : ");
		playerName2 = scanner.next();
		
		System.out.println("주사위 굴리는 횟수 지정 : ");
		count = scanner.nextInt();
		
		judge.registPlayer(playerName1, playerName2);
		
		while(index != count){
			judge.gamePlay();
			judge.result();
			index++;
		}
	}

}
