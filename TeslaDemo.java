public class TeslaDemo {

	public static void main(String[] args) {
		// Instantiate new Tesla Object
		Tesla modelS = new Tesla();
//		// public members can be accessed by the subclass
//		System.out.println(modelS.numberOfWheels);
//		// private members can not be accessed by the subclass
//		System.out.println(modelS.maxSpeed);	
		// Car properties are private - not inherited by superclass
		// However getter and setter methods from the super class
		// allow us to access them from the sub class		
		modelS.setMaxSpeed(250);
		modelS.setManufacturer("Tesla");
		System.out.println("The " + modelS.getManufacturer() +
				" has a maximum speed of " + modelS.getMaxSpeed() + "km/h");
		modelS.setChargeTime(75);
		System.out.println("It takes " + modelS.getChargeTime() + " minutes to recharge");	
	}
}
