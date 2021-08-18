package com.snakeladder;
import java.util.Random;

public class SnakeLadder {
	public static final int No_Play = 1;
	public static final int Ladder = 2;
	public static final int Snake = 3;
	
	public static void main(String[] args) {
	System.out.println("Welcome to Snake & Ladder");
	int pos1 = 0;
	int pos2 = 0;

	int diceCount = 0;

	Random rand = new Random();
	
	while(pos1!=100||pos2!=100) {
		
		//PLAYER 1
		
		//Dice gives 1-6 random output
		int dice = rand.nextInt(6) + 1;

		System.out.println("Player 1:Dice Number: "+dice);
		diceCount ++;
		
		//Select random option from 1-3
		int option = rand.nextInt(3) + 1;
		switch(option) {
		case No_Play: 
			System.out.println("Player 1: NO PLAY"); 
			break;
		case Ladder: 
			pos1=pos1+dice;
			if(pos1<0) {
				pos1 = 0;
			}
			System.out.println("Player 1:LADDER! Move ahead by "+dice+" steps. Final position :" +pos1 );
			break;
		case Snake:
			pos1=pos1-dice;
			if(pos1<0) {
				pos1 = 0;
			}
			System.out.println("Player 1:SNAKE! Move back by "+dice+" steps. Final position :" +pos1 );
			break;
		}
		if(pos1>100) {
			pos1=pos1-dice;
			System.out.println("Player 1:Dice Number greater than final position. Go back to previous position. Final position :" +pos1);
		}
		if(pos1==100) {
			System.out.println("Player 1 Wins!");
			break;
		}
		
		//PLAYER 2
		
		dice = rand.nextInt(6) + 1;

		System.out.println("Player 2:Dice Number: "+dice);
		diceCount ++;
		
		//Select random option from 1-3
		option = rand.nextInt(3) + 1;
		switch(option) {
		case No_Play: 
			System.out.println("Player 2:NO PLAY"); 
			break;
		case Ladder: 
			pos2=pos2+dice;
			if(pos2<0) {
				pos2 = 0;
			}
			System.out.println("Player 2:LADDER! Move ahead by "+dice+" steps. Final position :" +pos2 );
			break;
		case Snake:
			
			pos2=pos2-dice;
			if(pos2<0) {
				pos2 = 0;
			}
			System.out.println("Player 2:SNAKE! Move back by "+dice+" steps. Final position :" +pos2 );
			break;
		}
		if(pos2>100) {
			pos2=pos2-dice;
			System.out.println("Player 2:Dice Number greater than final position. Go back to previous position. Final position :" +pos2);
		}
		if(pos2==100) {
			System.out.println("Player 2 Wins!");
			break;
		}
		
		
	}
	System.out.println("Dice was rolled "+diceCount+" times.");

	}
}
