/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum.digit.m;

/**
 *
 * @author dell
 */
public class SumDigitM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(SumDigit(439));
        
    }
    
    public static  int SumDigit(int n ){
        int result = 0;
        
        int n1 = n / 100;
        int n2 = (n/10) % 10;
        int n3 = (n % 100) % 10;
        
        result= n1 + n2 + n3;
        
        return result;
    }
    
}
