public class SumTest{
    public static void main(String[] args) {
     long start = System.currentTimeMillis(); 
     long sum = 0 ; 
     for(int i =0 ;i < Integer.MAX_VALUE;i++){
        sum += i ; 
     }
     System.out.println(sum);
     long end = System.currentTimeMillis();
     double total = (end-start)/1000.0 ;  
     System.out.println("Time of execution: "+total+" sec");
    }
}