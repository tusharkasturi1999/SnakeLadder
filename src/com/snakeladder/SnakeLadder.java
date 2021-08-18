package com.snakeladder;
import java.lang.Math;
import java.util.Random;

public class SnakeLadder {
	public static final int No_Play = 1;
	public static final int Ladder = 2;
	public static final int Snake = 3;
	
	public static void main(String[] args) {
	System.out.println("Welcome to Snake & Ladder");
	int pos = 0;
	Random rand = new Random();
	
	while(pos!=100) {
		
		//Dice gives 1-6 random output
		int dice = rand.nextInt(6) + 1;
		System.out.println("Dice Number: "+dice);
		
		//Select random option from 1-3
		int option = rand.nextInt(3) + 1;
		switch(option) {
		case No_Play: 
			System.out.println("NO PLAY"); 
			break;
		case Ladder: 
			pos=pos+dice; 
			System.out.println("LADDER! Move ahead by "+dice+" steps. Final position :" +pos );
			break;
		case Snake:
			pos=pos-dice;
			System.out.println("SNAKE! Move back by "+dice+" steps. Final position :" +pos );
			break;
		}
		if(pos>100) {
			pos=pos-dice;
			System.out.println("Dice Number greater than final position. Go back to previous position. Final position :" +pos);
		}
		
		
	}System.out.println("Congratulations you WIN!!!");
	}
}
