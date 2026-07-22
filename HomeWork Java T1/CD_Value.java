/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cd_value;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class CD_Value {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first ammont");
        double firstAmmont = input.nextDouble();
        
        System.out.println("Enter yearly ammont in %");
        double YearlyAmmont = input.nextDouble();
        
        System.out.println("Enter the number of month");
        int numberOfMonth = input.nextInt();
    
      
            System.out.print("month\tCdValue\n");
        for (int i = 1 ; i <=numberOfMonth; i++ ){
          
            firstAmmont = (firstAmmont + firstAmmont*5.75 / 1200);
            firstAmmont = Math.round(firstAmmont);
            System.out.printf(i + "\t" + firstAmmont);
            System.out.println();
            
        }
    }
    
    
}
