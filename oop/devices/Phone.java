
public class Phone extends Device {

	public Phone() {
		super();
	}

	public void makeCall() {
		if (getBattery()  > 10) {
			System.out.println("You Make Call");
			this.decreaseBattery(5);
			this.displayBattery();
		} else {
			System.out.println("battery critical");
		}
	}

	public void playGame() {
		if (getBattery() > 25) {
			System.out.println("You play a game");
			this.decreaseBattery(20);
			this.displayBattery();
		} 
		else {
			System.out.println("battery critical : Do not play , you need to charge first!!!");
		}
	}

	public void charge() {
		System.out.println("You charge the phone");
		this.increaseBattery(50);
		this.displayBattery();
	}

}
