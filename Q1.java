package pack1;

public class Q1 {

public static void main(String[] args) {
	//Define a floating point number to read
double N=0.5;
//I want to have the system print zero if N is a zero.

if(N==0.0)
System.out.println("Zero");

//I want to know if N is positive or negative
if (N>0.0) {System.out.println("Positive");}
else {
	System.out.println("Negative");}

// If N is bigger than 1 mill, call it large
if(Math.abs(N)>1000000.0)
	System.out.println("Large");
{
	//If N is smaller than 1 it is smol
	if(Math.abs(N)<1.0)
	System.out.println("Small");
}
}
}
		



