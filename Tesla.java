public class Tesla extends Car {
	// Field
	private double chargeTime;
	/**
	 * The setChargeTime method sets the charge time
	 * @param timeToCharge - The time (minutes) to charge Tesla battery 100%
	 */
	public void setChargeTime(double timeToCharge)
	{		
		chargeTime = timeToCharge;
	}
	/**
	 * The getChargeTime method returns the charge time
	 * @return chargeTime - returns the chargeTime (minutes) to charge battery 100%
	 */
	public Double getChargeTime()
	{		
		return chargeTime;
	}
	// POLYMORPHISM
	public void printClass() {
		System.out.println("Printed from the Tesla Class");
	}
	// POLYMORPHISM
}
