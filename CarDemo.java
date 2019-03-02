public class CarDemo {

	public static void main(String[] args) {
		// Instantiate new Car Object
		// Object is an instance of a class
		// Can use Car class as a blue print to create multiple objects
		Car porsche = new Car();
		porsche.setMaxSpeed(300);
		porsche.setManufacturer("Porsche");
		System.out.println("The " + porsche.getManufacturer() +
				" has a maximum speed of " + porsche.getMaxSpeed() + "km/h");
	}
}
