package upskill.java_4;

public class Polymorephism {

	
	public static void main(String[] args){
		
	
}
	
	//Method Overloading- Comile time Polymorphism- Static binding
	//Same method name with different signature
	
	public static void car(){
		 System.out.println("My car is Audi !");
	}
	
	public static void car(int door){
		System.out.println("My car is Audi !, it has door: "+ door);
	}
	
	
	public static void car(String color){
		System.out.println("My car is Audi ! it has color: "+ color);
		
	}
		
	public static void car(int wheel, String brand){
		System.out.println("My car is "+ brand + !, it has wheel: "+ wheel);
	}
		
		
		
	}

