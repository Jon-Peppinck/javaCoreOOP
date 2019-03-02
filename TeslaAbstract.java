public class TeslaAbstract extends CarAbstract {
	// Field
	private double chargeTime;
	private double acceleration = 2.8; // 0-100 km/h in 2.8s
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
	@Override
	public void acceleration() {
		System.out.println("Accelerates from 0 to 100 km/h in " + acceleration + " seconds");
	}
	// POLYMORPHISM
}

