/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order_three_cities;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author dell
 */
public class Order_Three_Cities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter city 1");
        String c1 = input.next();
        System.out.println("Enter city 2");
        String c2 = input.next();
        System.out.println("Enter city 3");
        String c3 = input.next();
        
        
        
        String[] citiies = {c1 , c2 ,c3};
        
        Arrays.sort(citiies);
        
        System.out.println("Sorted");
        
        for (String i : citiies){
            System.out.println(i);
        }
        
        
        
        
        
    }
    
}
