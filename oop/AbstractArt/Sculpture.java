// inside of Sculpture.java
public class Sculpture extends Art {
    // TODO: implement Sculpture class
    private String material  ; 

    public Sculpture(){
        super() ; 
        this.material="Marble";
    }
    public Sculpture(String material){
        super() ; 
        this.material = material;
    }
    public Sculpture(String title,String author,String description,String material){
        super( title,author, description);
        this.material = material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

    protected void viewArt(){
        System.out.println("Welcome Sculpture Art:");
        System.out.println("Title: "+this.getTitle()+" | Author: "+this.getAuthor()+" |   Description: "+this.getDescription());
        System.out.println("Material: "+this.material);
        System.out.println("------------------------------");
    }
}
