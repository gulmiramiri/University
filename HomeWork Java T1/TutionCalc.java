/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutioncalc;

/**
 *
 * @author dell
 */
public class TutionCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double tution = 10000;
        double tottalCost = 0;
        
        for (int year = 1 ; year <=10 ; year++ ){
            tution*=1.05;
        }
        
        
        for (int i = 0 ; i<4 ; i++){
            tottalCost += tution;
            tution *= 1.05;
        }
        
        System.out.println("After 4 year " + tottalCost);
    }
    
}
