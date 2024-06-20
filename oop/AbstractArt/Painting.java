
// inside of Painting.java
public class Painting extends Art {
    // TODO: implement Painting class
    private String paintType ; 

    public Painting(){
        super() ; 
        this.paintType="Oil";
    }
    public Painting(String paintType){
        super() ; 
        this.paintType = paintType;
    }
    public Painting(String title,String author,String description,String paintType){
        super( title,author, description);
        this.paintType = paintType;
    }
    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }
    public String getPaintType() {
        return paintType;
    }

    protected void viewArt(){
        System.out.println("Welcome Painting Art");
        System.out.println("Title: "+this.getTitle()+" | Author: "+this.getAuthor()+" |   Description: "+this.getDescription());
        System.out.println("Material: "+this.paintType);
        System.out.println("------------------------------");
    }

} 

