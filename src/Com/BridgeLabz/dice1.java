package Com.BridgeLabz;

public class dice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				double empCheck;
		        
				empCheck=Math.floor((Math.random()*6)+1);
				int dice=(int)empCheck;
				System.out.println("Dice number= "+dice);
	}

}
