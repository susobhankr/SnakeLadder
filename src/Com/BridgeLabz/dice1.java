package Com.BridgeLabz;

import java.util.Random; 

public class dice1 {
		
		//class or static variable
		static final int Snake = 2;
		static final int ladder = 1;
		static final int Noplay = 0;

		public static void main(String[] args) 
		{
			int position = 0;
			Random ran = new Random();
			int dice = ran.nextInt(6)+1;
			System.out.println("Dice: "+dice);
			
			int optionCheck = ran.nextInt(3);
			System.out.println("optionCheck: "+optionCheck);
			
			if (optionCheck == ladder) 
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
			System.out.println("Position: "+position);
	}

}
