/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.pkgvoid.methoud;

/**
 *
 * @author dell
 */
public class TestVoidMethoud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        checkExam(98);
        
    }
    
    public  static void checkExam(double n){
        if (n >=90){
            System.out.println("A");
        }
        else if (n >=70){
            System.out.println("B");
        }
        else{
            System.out.println("Z");
        }
    }
    
}
