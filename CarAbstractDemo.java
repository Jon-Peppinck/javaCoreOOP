public class CarAbstractDemo {

	public static void main(String[] args) {
		// Instantiate new Tesla Object
		TeslaAbstract modelS = new TeslaAbstract();	
		modelS.setMaxSpeed(250);
		modelS.setManufacturer("Tesla");
		System.out.println("The " + modelS.getManufacturer() +
				" has a maximum speed of " + modelS.getMaxSpeed() + "km/h");
		modelS.setChargeTime(75);
		System.out.println("It takes " + modelS.getChargeTime() + " minutes to recharge");
		// Abstract method
		modelS.acceleration();
	}
}
