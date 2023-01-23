public class lab3 {
    public static void main(String[] args) {
        // number 4
        System.out.println("Changed to: " + replace("mass"));
        // number 3
        System.out.println("Bunny Ears: " + bunny(2, 5));
        // number 2
        System.out.println("Asterisk: " + asterisk("infectious"));
        //number 1
        System.out.println("Sum: " + nonNegative(676));
        
    }  
    public static int nonNegative(int x) {
        if (x == 0) {
            return 0;
        
        } else {
            return(x % 10) + nonNegative(x / 10);
        }
    }
    
    public static String asterisk(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return str.charAt(0) + "*" + asterisk(str.substring(1));
        }
    
    }

       public static int bunny(int bunnyEars, int bunnyAmount){
        if(bunnyAmount == 0){
            return 0;
        }
        return bunnyEars + bunny(bunnyEars,bunnyAmount-1);
    

    }
    public static String replace(String n) {
        if(n.equals("")) {
            return ""; 
        } 
        if(n.charAt(0) == 'x') {
            return "y" + replace(n.substring(1));
        }
        return n.charAt(0) + replace(n.substring(1));

    }
}
