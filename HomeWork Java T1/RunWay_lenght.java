
package runway_lenght;

import java.util.Scanner;


public class RunWay_lenght {

 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter v");
        double v = input.nextDouble();
        
        System.out.println("Enter accelertion");
        double a = input.nextDouble();
        
        double lenght = (v*v)/(2*a);
        
        System.out.println("Accelertion is " + a);
        
        
    }
    
}
