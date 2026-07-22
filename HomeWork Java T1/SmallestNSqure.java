/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallestnsqure;

/**
 *
 * @author dell
 */
public class SmallestNSqure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = 1;
        
        while((n*n) <= 12000){
            n++;
        }
        
        System.out.println("Result is " + n);
    }
    
}
