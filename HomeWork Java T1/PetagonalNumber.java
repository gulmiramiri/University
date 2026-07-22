/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petagonal.number;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class PetagonalNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of n");
        int n = input.nextInt();
        GetPetagonNum(n);
    }
    
    public static int GetPetagonNum(int n ){
        int coun = 10;
        for (int i = 1; i <= n ; i++){
            System.out.printf("%7d", (i * (3*i - 1))/2);
            coun++;
        }
        if (coun % 10 == 0){
            System.out.println();
        }
        System.out.println();
        return 0;
       
        
    }
    
}
