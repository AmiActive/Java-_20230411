
public class FizzBuzz {

	public static void main() {
		// 問一
		int number = 0;

		for (int i = 0; i < 15; i++) {
		    number += 1;
		    
		    if(number%3 == 0)
		    {
		    	 System.out.println("Fizz");
		    }
		    if(number%5 == 0)
		    {
		    	 System.out.println("Buzz");
		    }
		    if(number%3 == 0 && number%5 == 0)
		    {
		    	 System.out.println("FizzBuzz");
		    }
		   
		}

	}

}
