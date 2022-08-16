package exceptionalhandling;
	import java.util.*;
	public class UserDefinedExceptionhandling {

		public static void main(String[] args)throws DailyLimitCrossedException  {
		    System.out.println("Please Enter Withdraw Money: ");	//inputing the amount as integer
	        Scanner sc = new Scanner(System.in);     //reads input from the input stream  
	        int amount = sc.nextInt();               // java method used to scan the next token of input as int
	        try {
	        if(amount > 10000) {
	        	throw new DailyLimitCrossedException("Your Daily limit is crossed,Please enter the valid amount.... "); // throwing the user defined exception
	        }
	        }
	        catch(DailyLimintCrossedException exp)
	        {
	        System.out.println(exp);	
	        }
	        System.out.println("Money with drawn sucessfully");
	    }
	
	 
class DailyLimitCrossedException extends Throwable {
		 DailyLimitCrossedException(String str){
			 super(str);
		 }
	}
	}
