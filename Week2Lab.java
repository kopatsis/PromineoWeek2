package BoolsConditionalsLoops;

public class Week2Lab {
	
	public static void main (String[] args) {

		int age = 18;
		boolean hasLicense = true;
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}

		double costOfMilk = 2.5;
		int thirstLevel = 6;
		if (costOfMilk < 2.5 || thirstLevel > 6) {
			System.out.println("Milk Please");
		} else {
			System.out.println("No Thanks");
		}
		
		int numberOfCookies = 38;
		int numberOfChildren = 10;
		int remainingCookies = numberOfCookies % numberOfChildren;
		if (remainingCookies == 0) {
			System.out.println("Sad Face");
		} else if (remainingCookies < 2) {
			System.out.println("Yes!");
		} else if (remainingCookies < 5) {
			System.out.println("Whoohoooo");
		} else {
			System.out.println("Jackpot!");
		}
		
		String loyaltyMemberStatus = "GOLD";
		double loyaltyMemberDiscount = 0.0;
		switch (loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount = 0.10;
				break;
			case "GOLD":
				loyaltyMemberDiscount = 0.15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = 0.25;
				break;
		}
		System.out.println(loyaltyMemberDiscount);
		
		double billTotal = 638.9;
		double adjustedTotal = billTotal * (1 - loyaltyMemberDiscount);
		System.out.println(adjustedTotal);
		if (adjustedTotal > 500 && loyaltyMemberStatus.equals("SILVER")) {
			loyaltyMemberStatus = "GOLD";
		} else if (adjustedTotal > 500 && loyaltyMemberStatus.equals("GOLD")) {
			loyaltyMemberStatus = "PLATINUM";
		}
		System.out.println(loyaltyMemberStatus);
		
		String username = "Tommy123";
		String password = "12345";
		if (username.equals("Tommy123") && password.equals("12345")) {
			System.out.println("login successful");
		} else {
			System.out.println("access denied");
		}
		
		for(int x = 0; x < 10; x++) {
			System.out.println(x);
		}

		for(int y = 10; y >= 0; y--) {
			System.out.println(y);
		}
		 
		for(int i = 0; i <= 100; i +=2) {
			System.out.println(i);
		}
		
		for(int j = 0; j <= 100; j++) {
			if(j % 2 == 0) {
				System.out.println(j + " EVEN");
			} else {
				System.out.println(j + " ODD");
			}
		}
		
		int q = 100;
		while (q >= 0) {
			System.out.println(q + " " + q % 3);
			q--;
		}
		
	}

}
