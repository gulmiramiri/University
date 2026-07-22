/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.max;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class TestMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter num 1");
        int x = input.nextInt();
        System.out.println("Enter num 2");
        int y = input.nextInt();
        
        System.out.println("The large number is " + Max(x, y));
        

    }
    
    public static int Max(int num1, int num2){
        if (num1 > num2){
            return num1;
                    }
        else
            return num2;
                   
    }
    
}
