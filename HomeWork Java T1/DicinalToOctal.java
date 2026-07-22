/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicinal.to.octal;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class DicinalToOctal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a dicimal value");
        int dici = input.nextInt();
        
        int octal = 0;
        String b = "";
        while(true){
            
            octal = dici % 8  ;
            dici/=8;
            b += octal;
            
            
            if (dici < 8){
                b+=dici;
                break;
            }
            
            
            
            
        }
        for (int i = b.length()-1;i>=0;i--){
            System.out.print(b.charAt(i));
        }
        System.out.println();
    }
    
}
