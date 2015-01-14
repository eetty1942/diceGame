package com.maple;

import java.util.Scanner;

public class Player {
	public String playerName;
	public Scanner scanner = new Scanner(System.in);
	
	public selectMode(){ 

	System.out.println("번플레이어의 이름을 쓰시오 : ");
	playerName = scanner.next();
}
