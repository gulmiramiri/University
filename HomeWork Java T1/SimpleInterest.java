
package simpleinterest;
import java.util.Scanner;

public class SimpleInterest {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your participal :");
        int participal = input.nextInt();
        
        
        System.out.print("Enter your rate :");
        double rate = input.nextDouble();
        
        System.out.print("Enter the time :");
        double time = input.nextDouble();
        
        double si = (participal * rate * time) /100;
        
        System.out.println(si);
        
        
        
        
    }
    
}
