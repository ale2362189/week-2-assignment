package week2;

public class booleans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInWallet = true;
		
		double costOfMilk = 2;
		double moneyInWallet = 24;
		int thirstLevel = 5; 
		
		boolean shouldBuyIcecream = (isHotOutside && hasMoneyInWallet);
		
			if (shouldBuyIcecream == true) {
			System.out.println("Im going to buy some Ice cream!");
				}else { 
			System.out.println("im not getting ice cream.");
		}
		boolean willGoSwimming = (isHotOutside && !isWeekday);
		
			if (willGoSwimming == true) {
				System.out.println("Im going swimming!");
				}else {
					System.out.println("No swimming today.");
		}
		boolean isAGoodDay = (isHotOutside && hasMoneyInWallet);
		
			if (isAGoodDay == true) {
				System.out.println("I agree with Dr. Dre. Toay is a good day!");
				}else {
					System.out.println("I diagree with Dr. Dre. Today is not a good day.");
				}
		boolean willBuyMilk = (isHotOutside && thirstLevel >= 3 && moneyInWallet >= costOfMilk*2);
		
			if (willBuyMilk == true) {
				System.out.println("Woohoo, I'm buying milk, baby!"); 
			}else {
					System.out.println("looks like no milk today.");
			}
}

	}


