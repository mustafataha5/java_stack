public class FixedArray {
    public static void main(String[] args) {
        String [] str = new String[5] ; 

        for(int i =0 ; i< str.length;i++){
            System.out.println(str[i]);
        }
        double [] numbers = {2, 4, 12, 7, 23, 44, 5, 9, 7, 11, 10, 3};
        // Use the numbers array to print the following sums: 9, 56, 24, 100
        // The first one (9) has been done for you
        System.out.println(numbers[0] + numbers[3]);
        System.out.println(numbers);
    }
}
