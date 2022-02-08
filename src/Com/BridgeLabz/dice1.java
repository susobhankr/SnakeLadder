package Com.BridgeLabz;

import java.util.Random; 

public class dice1 {

	//class or static variable
	static final int Snake = 2;
	static final int ladder = 1;
	static final int Noplay = 0;
	static int DICE = 0;
	static final int PLAYER1 = 1;
	static final int PLAYER2 = 2;

	public static int positionCheck(int dice, int position, int optionCheck) 
	{	
		if ((optionCheck == ladder) && (position + dice)<=100)
		{
			System.out.println("Ladder");
			position = position + dice;
		}
		
		else if (optionCheck == Snake) 
		{
			System.out.println("Snake");
			position = position - dice;
		}
		else {
			System.out.println("No Play");
		}
		if (position<0)
			position=0;
		System.out.println("Position: "+position); return position;	
		
	}
	public static void main(String[] args) 
	{
		int playerOnePosition = 0;
		int playerTwoPosition = 0;
		int player = PLAYER1;
		System.out.println("playerOnePosition: "+playerOnePosition);
		System.out.println("playerTwoPosition: "+playerTwoPosition);
		Random ran = new Random();
		while ((playerOnePosition < 100) && (playerTwoPosition<100))
		{
		
		int dice = ran.nextInt(6)+1;
		System.out.println("dice: "+dice);
		++DICE;
		
		int optionCheck = ran.nextInt(3);
		System.out.println("optionCheck: "+optionCheck);
		
		if(player == PLAYER1)
		{
			
			playerOnePosition=positionCheck(dice, playerOnePosition, optionCheck);
			if ((optionCheck == Snake) || (optionCheck == Noplay)) 
			{
				player = PLAYER2;
			}									
		}
			else if (player == PLAYER2) 
		{
			playerTwoPosition=positionCheck(dice,playerTwoPosition,optionCheck);
			if ((optionCheck == Snake) || (optionCheck == Noplay)) 
			{
				player = PLAYER1;
			}
		}
					
	}
	System.out.println();
	System.out.println("Player One Position: " + playerOnePosition);
	System.out.println("Player Two Position"+ playerTwoPosition);
	System.out.println("diceCount: "+DICE);
	if(playerOnePosition == 100) 
	{
		System.out.println("Player One Wins");
	}
	else 
	{
		System.out.println("Player Two Wins");
		}
	}
		
}