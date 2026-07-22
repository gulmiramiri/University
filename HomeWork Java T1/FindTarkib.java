/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find.tarkib;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class FindTarkib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int cout = 0;
        for (int i = 0; i <=7 ; i++){
            for (int j = i+1; j<=7;j++){
                System.out.println("(" + i +", " + j +")");
                cout++;
            }
        }
        
        System.out.println("Totale combtion " + cout);
        
        
        
        
        
    }
    
}
