package pack1;
import java.util.Scanner;

public class Q3 {

public static void main(String[] args){
	
	//Name float variable for user input, "Number"
double number;
	// Bring in the scanner

	try (Scanner in = new Scanner (System.in)) {
		//Ask user for number
		System.out.print("Pick a Number ");
		//Read the user input and assign to variable "Number"
		 number = in.nextDouble();
	}
	
	//Is the Number positive?
	 if (number>0.0)
	 {
		 System.out.println("Positive");
	 }
	 //Is it Negative?
	 else if(number<0.0)
	 {
		 System.out.println("Negative");
	 }
	 //Or did you try to be cheeky and pick zero to mess with my code??
	 else if(number==0)
	 {
		 System.out.println("Zero");
}
}
}