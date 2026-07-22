/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compute_change;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Compute_Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter ammount ");
        String ammount = input.next();
        
        int dotindex = ammount.indexOf('.');
        int dollor = Integer.parseInt(ammount.substring(0, dotindex));
        int cent = Integer.parseInt(ammount.substring(dotindex+1));
        
        
        int total_cent = dollor * 100 + cent ;
        int qurter = total_cent / 25;
        total_cent%=25;
        
        int dimi = total_cent/10;
        total_cent%=10;
        
        int nikils = total_cent / 5 ;
        total_cent%=5;
        
        
        int pennies = total_cent;
        System.out.println("Your ammount is ");
        
        System.out.println("Dollor " + dollor);
        System.out.println("qurter " + qurter);
        System.out.println("dimi " + dimi);
        System.out.println("nukis " + nikils);
        System.out.println("pennies " + pennies);

    }
    
}
