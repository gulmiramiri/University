/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loancompartion;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class LoanCompartion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter ammount");
        double ammount = input.nextDouble();
        
        System.out.println("Enter period in  year");
        int year = input.nextInt();
        
        int month = 12 * year;
        
        System.out.println("Interst Rate\tmonthly pay\ttotal pay ");
        
        for (double annoulRate = 5.0 ; annoulRate <= 8.0 ; annoulRate+=0.125){
            double monthlyRate = annoulRate / 100 /12;
            
            double MonthlyPayment = (ammount * monthlyRate)/(1-Math.pow(1+monthlyRate, -month));
            double totalepayment = MonthlyPayment * month;
            
           System.out.printf("");
            
        }
    }
    
}
