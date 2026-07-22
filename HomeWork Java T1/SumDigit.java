
package sumdigit;


public class SumDigit {

    public static void main(String[] args) {
        System.out.println(sumDigit(344));
    }
    
    public static int sumDigit(int digit){
        int dig1 = digit / 100;
        int dig2 = (digit/10) % 10 ;
        int dig3 = (digit % 100) % 10;
        
        return dig1 + dig2 + dig3;
    }
    
}
