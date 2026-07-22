/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.perfex;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class CommonPerfex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter strinfg one");
        String t1 = input.nextLine();
        
        System.out.println("Enter string two");
        String t2 = input.nextLine();
        
        int minLenght = Math.min(t1.length(), t2.length());
        
        int i;
        
        for (i=0;i<minLenght;i++){
            if (t1.charAt(i) != t2.charAt(i)){
                break;
            }
        }
if (i>0){
    System.out.println("The perfix is "+t1.substring(0,i));
}        else
            System.out.println("No perfix");
        

        
    }
    
}
