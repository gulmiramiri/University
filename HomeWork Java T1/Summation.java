/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summation;

/**
 *
 * @author dell
 */
public class Summation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x = 1;
        double y = x+1;
        
        
        double sum = 0;
        for (int i = 1 ; i <=625; i ++){
            double z = 1 /(Math.pow(x, 0.5));
            x++;
            sum+=z;
        }
        
        System.out.println(sum);
  
        
    
    }
    
}
