/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimal.to.octa;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class DecimalToOcta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a decimal value");
        int dec = input.nextInt();
        int c =0;
        while(true){
            int x  = c % 8;
            c = dec / 8;
            
            System.out.println(x);
            
            break;
        }
    }
    
}
