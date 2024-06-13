import java.util.HashMap ; 

class Roman {

    public static void main(String[] args) {
        Roman roman = new Roman();
        System.out.println(roman.romanToInt("III"));
        System.out.println(roman.romanToInt("MCMXCIV"));
        System.out.println(roman.romanToInt("IV"));
    }
    public int romanToInt(String s) {
        HashMap<Character,Integer> roman = new HashMap<Character,Integer>() ; 

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int total = 0 ; 
        int x ,y ; 
        int j = 0 ; 
        for(int i =1; i< s.length();i++){
            y= roman.get(s.charAt(i)); //  
            x = roman.get(s.charAt(j)); //
           // System.out.println(x+ " <<>>"+ y +"="+total );
            if( x< y ){
                total +=  y-x ; 
                i++;
                j++;
            }
            else {
                total += x;
            }
            j++ ; 
            //System.out.println(x+" : "+y +" <<>>"+"="+total );
        }

        //the last element of string 
        if (j < s.length()){
        total += roman.get(s.charAt(j));
        }
     //System.out.println(" <<>>"+"="+total );

        return total ; 


    }

    
}