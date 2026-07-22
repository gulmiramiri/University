/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count.max;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class CountMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int count = 0;
        while(true){
            System.out.println("Enter number enter 0 to exit");
            int num = input.nextInt();
            
            if (num > max ){
                max = num;
            }
            if (num == max){
                count++;
            }
            
            
            if (num == 0){
                break;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
    
}
