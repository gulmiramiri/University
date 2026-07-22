/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd.methoud;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class GCDMethoud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter num 1 ");
        int num1 = input.nextInt();
        System.out.println("Enter num 2");
        int num2 = input.nextInt();
        
        System.out.println("The gcd is " + gcd(num1, num2));
    }
    
    public static int gcd(int n1 , int n2){
        int gcd = 1;
        int k = 2;
        
        while(k <= n1 && k <= n2){
            if (n1 % k == 0 && n2 % k == 0){
                gcd = k;
            }
            k++;
        }
        return gcd;
    }
    
}
