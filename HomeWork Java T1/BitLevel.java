/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit.level;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class BitLevel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a short integer");
        short num = input.nextShort();

        for(int i = 15 ; i>=0; i--){
            int bit = (num >> i) &1;
            System.out.print(bit);
        }
        System.out.println();
    }
    
}
