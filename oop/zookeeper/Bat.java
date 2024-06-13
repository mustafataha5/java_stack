public class Bat extends Mammal {

    public Bat(){
        super(300,300);
    }

    public void fly(){
        System.out.println("-------------------");
        if(getEnergyLevel() >= 50 ){
        this.decreaseEnergy(50) ;
        System.err.println("The Bat is airborne "); 
        this.displayEnergy();}
        else{
            System.err.println("No enough energy to fly");
        }
    }

    public void eatHumans(){
        System.out.println("-------------------");
        this.increaseEnergy(25) ;
        System.err.println("The Bat's  satisfaction "); 
        this.displayEnergy(); 
    }
         

    public void attackTown(){
        System.out.println("-------------------");
        if(getEnergyLevel() >= 100 ){
        this.decreaseEnergy(100) ;
        System.err.println("The Bat's attack"); 
        this.displayEnergy();}
        else{
            System.out.println("No enough energy to attack");
        }
    }
}
