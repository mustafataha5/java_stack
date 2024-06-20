public abstract class Art {
    private String title ; 
    private String author ; 
    private String description;

    public Art(){
        this("any title","unknown","Description Text here");
    }
    public Art(String title,String author,String description){
        this.title=title ; 
        this.author = author ; 
        this.description=description ; 
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    protected abstract void viewArt() ; 
}