
package convertpoundtokelogram;

import java.util.Scanner;

public class ConvertPoundToKelogram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number in pound :");
        double pound = input.nextDouble();
        
        double convert = pound * 0.454;
        
        
        System.out.println("Your convert is " + convert);
    }
    
}
