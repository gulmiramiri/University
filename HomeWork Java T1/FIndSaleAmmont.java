/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find.sale.ammont;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class FIndSaleAmmont {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your ammont");
        double amm = input.nextDouble();
        
        System.out.println("Enter your final comeson");
        double targetCamesoon = input.nextDouble();
        double comes = 0;
        for (int i = 0;i<targetCamesoon;i++){
            
                    
        if (amm > 5000){
            comes= amm * 0.08;
        }
        else if (amm >= 10000){
        comes = (5000 * 0.08) + (5000 - amm) * 0.10;
    }
        else{
            comes = (5000 * 0.08) + (5000 * 0.10) + (10000 - amm)*0.12;
        }
            
        }
        
        System.out.println(comes + " is your comesoon");
        
        
    }
    
}
