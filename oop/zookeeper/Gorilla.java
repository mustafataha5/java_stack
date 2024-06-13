public class Gorilla extends Mammal {


    public void  throwSomething(){

        System.out.println("-------------------");
        this.decreaseEnergy(10) ;
        System.err.println("The Gorilla has thrown Something "); 
        this.displayEnergy();
    }

    public void eatBananas(){
        System.out.println("-------------------");
        this.increaseEnergy(10) ;
        System.err.println("The Gorilla's  satisfaction "); 
        this.displayEnergy();  
    }

    public void climb(){
        System.out.println("-------------------");
        this.decreaseEnergy(5) ;
        System.err.println(" The Gorilla has climbed a tree "); 
        this.displayEnergy();
    }


    
}
