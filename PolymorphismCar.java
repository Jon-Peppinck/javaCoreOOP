public class PolymorphismCar {

	public static void main(String[] args) {
		// A Car variable can be used to reference a Tesla 
		Car model_S = new Tesla();
//		Car model_S = new Car();
		model_S.setMaxSpeed(250);
		model_S.setManufacturer("Tesla");
		System.out.println("The " + model_S.getManufacturer() +
				" has a maximum speed of " + model_S.getMaxSpeed() + "km/h");
		model_S.printClass();
	}
}
