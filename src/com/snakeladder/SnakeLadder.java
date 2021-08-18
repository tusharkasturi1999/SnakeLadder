package com.snakeladder;
import java.lang.Math;
import java.util.Random;

public class SnakeLadder {
	public static void main(String[] args) {
	System.out.println("Welcome to Snake & Ladder");
	int pos = 0;
	Random rand = new Random();
	
	while(pos!=100) {
		int dice = rand.nextInt(7) + 1;
		System.out.println("Dice Number: "+dice);
	}
	}
}
