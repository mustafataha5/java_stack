// inside of Museum.java

import java.util.ArrayList;

public class Museum {
    public static void main(String[] args) {
        // TODO: create paintings and sculptures here

        ArrayList<Art> meseum = new ArrayList<Art>() ; 


        Art p1 = new Painting("Molensa","DaVinci","Painted in France at 1506","Oil");
        Art p2 = new Painting("Girls with pearl earrings","Johannes Vermeer","dated c. 1665","Oil ");
        Art p3 = new Painting("The Great Piece of Turf ","Albrecht Dürer","created at Nuremberg workshop in 1503.","Watercolor");
    
        Sculpture s1 = new Sculpture("The Nefertiti Bust","Acient Egyptian","have been crafted in 1345 BC","Marble");
        Sculpture s2 = new Sculpture("The Thinker","Auguste Rodin","The Thinker has now become one of the most iconic bronze sculptures","Bronze");
        

        meseum.add(p1);
        meseum.add(p2);
        meseum.add(p3);
        meseum.add(s1);
        meseum.add(s2);

        for( Art art : meseum){
            art.viewArt();
        }
    }
}