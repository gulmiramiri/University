
package compound_value;

import java.util.Scanner;

public class Compound_value {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.println("Enter money you want to save");
        double mountlySave = input.nextDouble();
        
        double mountlyInsertRate = 0.05/12;
        
        double accuontValue = 0;
        accuontValue = (accuontValue + mountlySave) * (1+mountlyInsertRate);
        accuontValue = (accuontValue + mountlySave) * (1+mountlyInsertRate);
        accuontValue = (accuontValue + mountlySave) * (1+mountlyInsertRate);
        accuontValue = (accuontValue + mountlySave) * (1+mountlyInsertRate);
        accuontValue = (accuontValue + mountlySave) * (1+mountlyInsertRate);
        accuontValue = (accuontValue + mountlySave) * (1+mountlyInsertRate);
        
        
        System.out.println("Ofter six mount "+ accuontValue);
        
        
    }
    
}
