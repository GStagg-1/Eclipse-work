package pack1;
//import scanner utility
import java.util.Scanner;
public class Q4 {
public static void main(String[] args){
	//bring scanner into main string
	
	try (Scanner in = new Scanner (System.in)){
		
	//ASk user for #
		System.out.println("Pick a number between 0-100 ");
		double userinput = in.nextDouble();
		if (userinput>100.0)
		{
		System.out.println("Invalid Input, Try Again");
		}
		else if(userinput<0.0)
		{
		System.out.println("Invalid Input, Try Again");
		}
		else 
		if (userinput>50.0)
		{
		System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		main(args);
}
}
}