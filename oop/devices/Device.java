
public class Device {
	private int battery ; 
	
	
	public Device() {
		this.battery  = 100 ; 
	}


	public int getBattery() {
		return battery;
	}


	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	public void displayBattery(){
		System.out.println("Battery remaining:"+this.getBattery());
	}
	
	public void increaseBattery(int amount) {
		if(amount > 0   ) {
			if(this.battery+amount < 100) {
			this.battery = this.battery+amount%100 ;}
			else if (this.battery+amount > 100) {
					this.battery = 100 ; 
			}
		} 
		
	}
	
	public void decreaseBattery(int amount) {
		if(amount > 0   ) {
			if(this.battery-amount > 0) {
			this.battery = this.battery-amount%100 ;}
			else if (this.battery-amount < 0 ) {
					this.battery = 0 ; 
			}
		}  
	}

}
