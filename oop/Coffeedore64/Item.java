//package orderItem;
//package BaristaChallenge ; 
public class Item {

    private String name;
    private double price;
    private int index ; 

    public Item(String name, double price,int index) {
        this.name = name;
        this.price = price;
        this.index=index ; 
    }

    public Item() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public int getIndex() {
        return index;
    }

}
