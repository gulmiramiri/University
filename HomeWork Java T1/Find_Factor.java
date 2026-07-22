/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find_factor;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Find_Factor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a integer");
        int num = input.nextInt();
        
        String factor = "";
        int k = 1;
        int s = 1;
        while (s <= num){
            if(num % k == 0){
                factor+=k;
                
            }
            k++;
            
        }
        
        System.out.println(factor);
    }
    
}
