public abstract class CarAbstract {
	// Properties / Fields / Variables / Attributes
	// Private Access Modifiers - Often used to hide code
	private String manufacturer;
	private double maxSpeed;
	// INHERITANCE
	public int numberOfWheels = 4;
	// END INHERITANCE
	// POLYMORPHISM
	public void printClass() {
		System.out.println("Printed from the Car Class");
	}
	public abstract void acceleration();
	// POLYMORPHISM
	
	// Methods / Functions
	// Setter / Mutator - Control changes to a variable
	/**
	 * The setManufacturer method sets the manufacturer of the vehicle
	 * @param brand - brand of the vehicle
	 */
	public void setManufacturer(String brand)
	{		
		manufacturer = brand;
	}
	/**
	 * The setMaxSpeed method sets the maxSpeed 
	 * @param maxVelocity - The maximum speed (km/h) of the vehicle
	 */
	public void setMaxSpeed(double maxVelocity)
	{		
		maxSpeed = maxVelocity;
	}
	// Getter / Accessor - Returns value of private variable
	/**
	 * The getManufacturer method returns the manufacturer of the vehicle
	 * @return manufacturer - returns the manufacturer of the vehicle
	 */
	public String getManufacturer()
	{		
		return manufacturer;
	}
	/*
	 * The getMaxSpeed method returns the maxSpeed (km/h)
	 * @return maxSpeed - returns the maximum speed of the vehicle
	 */
	public double getMaxSpeed()
	{		
		return maxSpeed;
	}
}
