package exceptionalhandling;

public class UserDefinedExceptionhandling02 {
   public static void main(String [] args) {
	   try {
		   int age = 140;
		   if(age>=100)
		   {
			   throw new MyOwnException("Age = "+age+" It's not possible");
		   }
	   }catch(MyOwnException ex)
	   {
		   System.out.println(ex);
	   }
	   System.out.println("Execution Complete");
   }
}
