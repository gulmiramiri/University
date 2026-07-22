
package calculate_energy;

import java.util.Scanner;

public class Calculate_energy {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter water in KG");
        double water = input.nextDouble();
        
        System.out.println("Enter inital temerature");
        double ini_tep = input.nextDouble();
        
        System.out.println("Enter final temprture");
        double final_tem = input.nextDouble();
        
        double q = water * (final_tem - ini_tep) * 4184;
        
        System.out.println("The energy is " +  q);
    }
    
}
