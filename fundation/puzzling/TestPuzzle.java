import java.util.ArrayList;

public class TestPuzzle {

    
    public static void main(String[] args) {
        Puzzle puzzle = new Puzzle() ; 
        ArrayList<Integer> arr = puzzle.getTenRolls();
        System.out.println("-------------------Task 1");
        System.out.println("Array  :"+arr);
        // for(int i=0 ; i < arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        
        System.out.println("-------------------Task 2");
        System.out.println(puzzle.getRandomLetter());
        System.out.println("-------------------Task 3");
        System.out.println(puzzle.generatePassword());
        System.out.println("-------------------Task 4");
        System.out.println(puzzle.getNewPasswordSet(5));
        System.out.println("-------------------Task 5");
        System.out.println("Before Shuffle : "+arr);
        System.out.println("After Shuffle of 10 steps :"+puzzle.shuffleArray(arr, 10));

    }

}
