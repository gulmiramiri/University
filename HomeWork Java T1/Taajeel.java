
package taajeel;

import java.util.Scanner;


public class Taajeel {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter v0");
        double v0 = input.nextDouble();
        
        System.out.println("Enter v");
        double v = input.nextDouble();
        
        System.out.println("Enter t");
        double t = input.nextDouble();
        
        
        double result = (v - v0)/t;
        
        System.out.println(result);
        
        
    
    }
    
}
