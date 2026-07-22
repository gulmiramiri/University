
package sumnaturalnumbers;
import java.util.Scanner;

public class SumNaturalNumbers {

  
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.print("Enter the numer you want to calculate :");
        int num = input.nextInt();
        
        int sum_natural = num * (num + 1) / 2;
        
        System.out.println("Your result is " + sum_natural);
        
        
    }
    
}
