
package convertfoottometer;

import java.util.Scanner;

public class ConvertFootToMeter {

    
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a vlue too feet :");
        double foot = input.nextDouble();
        
        double covert = foot * 0.305;
        
        System.out.println(foot + " Foot is " + covert + " meter");
        
        
    }
    
}
