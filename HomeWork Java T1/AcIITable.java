/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aciitable;

/**
 *
 * @author dell
 */
public class AcIITable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;
        // TODO code application logic here
        for (int i = 33; i <= 126 ; i++){
            System.out.println((char)i + " ");
        }
        if(cont % 10 == 0){
            System.out.println();
        }
    }
    
}
