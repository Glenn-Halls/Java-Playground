package fruitorder;

public class FruitOrder {

    public static void main(String[] args) {

		exeTestCases();

    }
    
    public static String calculate(char fruitCode, double weight) {
		
        String message="";
        double price = 0;
        String fruitType = "";
        boolean isValidCode = true;
		
		switch (Character.toUpperCase(fruitCode)) {
			case 'A':
				fruitType = "Apples";
				price = weight * 1.75;
				break;
			case 'B':
				fruitType = "Bananas";
				price = weight * 2.65;
				break;
			case 'C':
				fruitType = "Carrots";
				price = weight * 1.95;
				break;
			case 'D':
				fruitType = "Dates";
				price = weight * 6.40;
				break;
			default:
				isValidCode = false;
				message = "Invalid fruit code entered";
				break;            
	   }            
	   if (isValidCode) {
			message = "You are buying " + weight + "kgs of " +
			fruitType + " for $" + price;
	   }

		return message;                    
    }

	public static void exeTestCases() {
		// Testcase 1
		System.out.println("Test case 1: \n" + calculate('A', .5));
	}

}


