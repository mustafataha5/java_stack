import java.util.ArrayList;



public class Order {
    private String name ;  
    private boolean ready ; 
    private ArrayList<Item> items ;

    public Order (String name){
        this.name = name ; 
        this.items = new ArrayList<Item>();
    }

    public Order (){
        this.name = "Guest" ; 
        this.items = new ArrayList<Item>();
    }
   

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public boolean isReady() {
        return ready;
    }

    public void addItem(Item item){
        this.items.add(item) ;
    }

    public String getStatusMessage(){
        if(this.isReady()){
            return  "Your order is ready."; 
        }
        else{
            return "Thank you for waiting. Your order will be ready soon." ; 
        }
    }

    public double getOrderTotal(){
        double total = 0 ; 
        Item temp ; 
        for (int i=0;i<this.items.size();i++){
            total += this.items.get(i).getPrice() ; 
        }
        return total ; 
    }
    public void display(){
        
    
        System.out.println("Customer Name: "+this.name);

        for( Item item : this.items){
                System.err.println(item.getName()+" - $"+item.getPrice());
        }

        System.err.println("Total : $"+this.getOrderTotal());
    }
}