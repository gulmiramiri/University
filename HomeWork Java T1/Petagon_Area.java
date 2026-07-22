
package petagon_area;

import java.util.Scanner;


public class Petagon_Area {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter the lenght from center to vertax (r)");
        double r = input.nextDouble();
        
        
        double s = 0;
        double area = 0;
        if (r >= 0 ){
             s = 2 * r * Math.sin(Math.PI / 5);
             area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
            
        }
        
        System.out.println("The area is " + area);
            

    }
    
}
