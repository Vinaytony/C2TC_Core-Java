package exceptionalhandling;
  import java.util.*;                               //imports all the classes and interface with in package and make them available to use within the current class or interface
    public class UserDefinedExceptionhandling02 {
    public static void main(String [] args) {
	
	   Scanner sc=new Scanner(System.in);        //Reads input from the input stream
	   System.out.println("Enter the Age:");     // print statement 
	   int age =sc.nextInt();                     //java method used to scan the next token of input as int
	   System.out.println("Your age is "+age);      //reads the input and display it on console
	   
	   try {                                         // block of code that may throw exception
		   int age1 = age;                             // assigning the value to the variable
		if(age1<=65)                                    // comparison between assigned value and standard value 
		   {
			   throw new MyOwnException("Age = "+age1+" Person not eligible for pension");  //Throw new keyword is used to creat custom error
		   }
	   }catch(MyOwnException ex)                      //constructor, block of codes to be tested for exception
	   {
		   System.out.println(ex);                      // prints the exception statement
	   }
	   System.out.println("Contact customer helpline number-9980554169 in case of any queries");        // printing the final statement out of try and catch block 
   }
}
