
public class Driver extends Car {
	public int drive() {
		if (gas > 1) {		
			gas--;
			super.displayGasRemaining();
		} else if (gas >= 1) {
			gas--;
			super.displayGasRemaining();
			System.out.println("No fuel remaining... EMERGENCY FLINTSONE MODE ENGAGED");
			super.checkRemainingGas(gas);
		}
		return gas;
	}
	
	public int boost() {
		if (gas >= 3) {
			gas -= 3;
			System.out.println("Thrusters... Engage!");
			super.displayGasRemaining();
		} else if (gas < 3) {
			System.out.println("Boost disabled... Not enough gas!");
		}
		return gas;
	}
	
	public int refuel() {
		if(gas >= 8) {
			System.out.println("Overfuel not permitted!");
			return gas;
		}
		gas += 3;
		System.out.println("Gas refueld to: " + gas);
		return gas;
	}
}
