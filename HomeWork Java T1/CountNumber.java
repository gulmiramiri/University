/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countnumber;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class CountNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("ENter integer number enter 0 to exit");
        int positiveNum = 0;
        int negitiveNum = 0;
        int sum = 0;
        int count = 0;
        
        
        
        while(true){
            int num = input.nextInt();
            
            if (num == 0){
                break;
            }
            
            sum+=num;
            count++;
            
            if(num > 0){
                positiveNum++;
            }
            else
                negitiveNum++;
            
            
            
        }
        
        double avvrege = (double) (sum/count);
        
        
        System.out.println("Positive number is " + positiveNum);
        System.out.println("NegitiveNumber is " + negitiveNum);
        System.out.println("Total is " +sum);
        System.out.println("Count is " + count);
        System.out.println("Avvrege is " + avvrege);
        
    }
    
}
