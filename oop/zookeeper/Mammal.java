

public class Mammal{

    private int energyLevel ;
    private int maxLevel;

    public Mammal(){
        this(100,100);
    }

    public Mammal(int energyLevel,int maxLevel){
        this.energyLevel = energyLevel ; 
        this.maxLevel = maxLevel ; 
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void displayEnergy (){
        System.out.println("Energy Level :"+this.energyLevel);
    }

    
    public void decreaseEnergy(int amount){
        if(amount > 0){
            if(this.energyLevel-amount > 0){
               this.energyLevel = this.energyLevel - amount ; 
            }
            else{
                this.energyLevel = 0 ; 
            }
        }
        else{
            System.out.println("Invalid amount value : muust greater than 0 ");
        }
    }
    public void increaseEnergy(int amount){
        if(amount > 0){
            if(this.energyLevel+amount < maxLevel){
               this.energyLevel = this.energyLevel + amount ; 
            }
            else{
                this.energyLevel = maxLevel ; 
            }

        }
        else{
            System.out.println("Invalid amount value : muust greater than 0 ");
        }
        
    }
}