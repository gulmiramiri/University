/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumnumber;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class SumNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter num to sum enter 0 to exait");
        int data, sum;
        
        sum = 0;
        
        do{
            data = input.nextInt();
            sum+=data;
        }while (data!=0);
        
        System.out.println(sum);
        
    }
    
}
