/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annontmonthlyrate;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class AnnontMonthlyrate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // مبلغ پس اندار
        System.out.println("Enter ammount you pay in month");
        double mp = input.nextDouble();
        
        System.out.println("Enter the in year rate in %");
        double yearR = input.nextDouble();
        
        System.out.println("Enter the cont of month");
        int month = input.nextInt();
        
        double monthR = (yearR / 100) / 12;
        double j=0;
        double futurAmm = 0;
        for (int i = 0 ; i < month ; i++){
            futurAmm = (100 + j) *(1+monthR);
            
            j = futurAmm;
        }
        
        System.out.println(futurAmm);
    }
    
}
