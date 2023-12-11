import java.util.Scanner;

public class Autot {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String answer = "";
		Car car = new Car("Toyota", "RAV4", 40);
		car.printData();
		System.out.println("a=accelerate b=break x=exit");
		answer = in.nextLine();

		while (!answer.equals("x")) {
//			System.out.println("a=accelerate b=break x=exit");
//			answer = in.nextLine();
				if(answer.equals("a")) {
					car.accelerate();
					System.out.println("a=accelerate b=break x=exit");
					answer = in.nextLine();
				}
				if(answer.equals("b")) {
					car.brake();
					System.out.println("a=accelerate b=break x=exit");
					answer = in.nextLine();
				}
		}
		
		in.close();

	}//end main

}//end Autot

//Auto-luokka
class Car {
	
	private String brand;
	private String model;
	private int amountOfFuel;
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Car() {
		brand = "";
		model = "";
		amountOfFuel = 0;
		printData();
	}
	
	public Car(String brand, String model, int amountOfFuel) {
		this.brand = brand;
		this.model = model;
		this.amountOfFuel = amountOfFuel;
		printData();
	}	
	
	public void brake() {
		System.out.println("Car is breaking");
	}
	
	public void accelerate() {
		if (amountOfFuel > 0) {
			System.out.println("Car is accelerating");
			amountOfFuel --;
		} 
	}
	
	public void refuel(int amount) {
		System.out.println("Fuel in the tank: " + amountOfFuel);
		System.out.println("Refuel: " + amount);
		amountOfFuel = amountOfFuel + amount;
		System.out.println("Fuel in the tank after the refuel: " + amountOfFuel);
	}
	
	public void printData() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Fuel: " + amountOfFuel);
	}
	
}