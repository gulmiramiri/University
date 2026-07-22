/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isbn;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class ISBN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        int n1;
  
        int sum=0;
        for (int m = 1 ; m <= 10 ; m++){
        System.out.println("Enter number ISBN "+m);
        n1 = input.nextInt();
            sum += (m*n1);
            
            }
        
        if (sum % 11 == 0)
            System.out.println("The isbn is Valid");
        
        else
            System.out.println("The isbn is invalid");
        }
        
    
    }
    

