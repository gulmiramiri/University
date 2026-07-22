/
package changedollor;

import java.util.Scanner;

public class Changedollor {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an ammount to change");
        double ammount = input.nextDouble();
        
        int ramingammount = (int) ammount *100;
        
        int numberOfOneDollor = ramingammount / 100;
        ramingammount = ramingammount % 100 ;
        
        
        // Qurter
        
        int numberOFQurter = ramingammount / 25;
        ramingammount = ramingammount % 25;
        
        // Dems
        
        
        int numberOFdem = ramingammount/10;
        ramingammount = ramingammount % 10;
        
        int numberOfNikil = ramingammount / 5 ;
        ramingammount = ramingammount % 5 ;
        
        int numberOFPennies = ramingammount;
        
        System.out.println("Your ammount is "+ ammount + "Constis of");
        System.out.println(numberOfOneDollor + "dolor");
        System.out.println(numberOFQurter +" qurter");
        System.out.println( numberOFdem+"Diems");
        System.out.println(numberOfNikil + "Nikil");
        System.out.println(numberOFPennies + "Pentis");
        
        
        
        
        
        
    }
    
}
