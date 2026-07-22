/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretuition;

/**
 *
 * @author dell
 */
public class FutureTuition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double tution = 1000;
       int year = 0;
       
       while(tution < 2000){
           tution = tution * 1.07;
           year++;
       }
       
        System.out.println(year);
    }
    
}
