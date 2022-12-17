
public class Car {
	public int gas = 10;
	
	public void displayGasRemaining() {
		System.out.println(gas + " gas remaining.");
	}
	
	public void checkRemainingGas(int gas) {
		if(gas == 0) {
			System.out.println("Game Over RIP");
		}
	}
}
