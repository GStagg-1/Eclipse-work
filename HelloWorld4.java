package hellowrld;

public class HelloWorld4 {
			//Print Hello World using instance variable
	//instance variables
		String helloWorld;
	
			//Constructor
HelloWorld4(){
	//Initialize instance variable hello
helloWorld = "Hello World!";
	}

	public static void main(String[] args) {	
	//instance object creation
		HelloWorld4 myobject = new HelloWorld4();
		myobject.hello();
	}
	public void hello() {
		System.out.println(helloWorld);
	}
}
