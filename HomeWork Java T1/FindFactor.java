/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findfactor;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class FindFactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a integer");
        int num = input.nextInt();
        
        
        for (int i = 2; i <= num ; i++){
            
            while(num % i == 0){
                System.out.println(i+" ");
                num/=i;
            }
            
        }
    }
    
}
