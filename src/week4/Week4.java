package week4;

public class Week4 {

	public static void main(String[] args) {
		
		System.out.println("Question 1");
		
		int[] ages = {3,9,23,64,2,8,28,93};
		
		int firstMinusLast = ages[0] - ages[ages.length - 1];
		System.out.println(firstMinusLast);
		
		ages[ages.length -1] = 21;
		
		int firstMinusLastB = ages[0] - ages[ages.length - 1];
		System.out.println(firstMinusLastB);
		
		double sum = 0;
		
			for(int x : ages) {
				sum += x;
				
			}
		System.out.println(sum / ages.length);
		
		
		
		   System.out.println("Question 2");
		   //	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.");
		   String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		   //a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console
		    
		   sum = 0;
			for (int i = 0; i < names.length; i++) {
				sum += names[i].length();
			}
			double average = sum / names.length;
			System.out.println(average );
			
			String allNames = "";
			for (int i = 0; i < names.length; i++) {
				allNames += names[i] + " ";
			}
			System.out.println(allNames);
			
			
			
			System.out.println("Question 3");
			//("Use array[array.length] to access the last element of an array"); or array[array.length -1]); 
			System.out.println("Question 4");
			//("Use array[0] to access the first element of an array"); 
			
			System.out.println("Question 5");
			int[] nameLengths = new int[names.length];
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
			}
			System.out.println("Question 6");
			sum = 0;
			for (int i = 0; i < nameLengths.length; i++) {
				sum += nameLengths[i];
			}
			System.out.println(sum);
			
			System.out.println("Question 7");
			
			//System.out.println(isStringLongerThanNumber("Hello", 3)); from weeklab 3 video 2 
			
			System.out.println("Question 8");
			//System.out.println(getFullName("Juan","Guerrero"));
			
			System.out.println("Question 9");
			//System.out.println("Sum is greater than 100");
	//}
	//else{
		//System.out.println("Sum is not greater than 100");
			
			System.out.println("Question 10");
			/* public static double calculateAverage(double[int]numbers){
			 * double sun =0;
			 * for(double number : array){
			 * sum += number; {
			 * return sum/array.length;
			 * 
			 * double [] doubles = (45.7,30.2,67.3));
			System.out.println(CalculateAverage(doubles));
			 * 
			 */
			
			System.out.println("Question 11");
			//System.out.println("Average of first array is greater than second ");{
				
			//}else{
				//System.out.println("Average of first array is less than second ");
			
			System.out.println("Question 12");
	         //if(willBuyDrink(true,10.51))
	       //  {
	         //	System.out.println("You can buy Drink");
	        // }
	        // else{
	         	//System.out.println("You cannot buy Drink!!");
			
			System.out.println("Question 13");
			System.out.println("Bills");
			addition(100,300);
			addition(100,300);
			addition(100,200);
			
			
			// in the method that i created i calculate how much i spend on bills needed to lived
			// i created this method because im still pretty cofused
			// and this method that created seeing pretty simple and easy enough for me to explain 
			
			
			
			
			//int  internet = 100;
			//int  utilities = 300;
			//System.out.println(internet + utilities);
	       
			//int  rent = 1000;
			//int  food = 300;
			//System.out.println(rent + food);
			
			//int  entertaiment = 100;
			//int   gas = 200;
			//System.out.println(entertaiment + gas);
			
			
			
			
			
			
			
			

	}//end of main method 
	public static void addition(int internet , int utilities) {
		System.out.println(internet + utilities);
		
	}
	

	private static boolean willBuyDrink(boolean b, double d) {
		// TODO Auto-generated method stub
		return false;
	}

	private static Object getFullName(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

}// end of class 
