package week6;

public class local101 {
	String br = "Black Dimond";//instance variable or object
	static int age =10 ;//static variable age
	static String cat = "Luca";//static variable cat
	
	public static void main(String[]args) {
		//body of method
		//using local variable age outside it's scope
		String owner = "Lisa";//local variable owner
		local101 obj = new local101();
		
		System.out.println("The name of  is: " + cat + " and Toommy is : "+ owner );
		catlisa();
		obj.display();
	}
	public static void catlisa() {
		//body of sub method name is cat 
		//local variable age
		 age = 1;
		age=age+5;
		System.out.println(age);
	}
	public void display() {
		System.out.println(br);
	}
}
