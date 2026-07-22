
package swaptwonumber;


public class SwapTwoNumber {

 
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        
        System.out.println(x);
        System.out.println(y);
        
        x = x + y;
        y = x - y;
        x = x - y;
        
        System.out.println(x);
        System.out.println(y);
        
        
    }
    
}
