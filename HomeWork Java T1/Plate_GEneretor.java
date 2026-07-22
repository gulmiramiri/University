/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plate_generetor;

/**
 *
 * @author dell
 */
public class Plate_GEneretor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String plate = "";
        
        for (int i = 0; i < 3 ; i++){
            char letter = (char) ('A' + Math.random()*26);
            plate+=letter;
        }
       
        
     
        
      for (int i=0; i<4 ;i++){
          int digit = (int) (Math.random()* 10);
          plate+=digit;
      }
      
        System.out.println(plate);
        
       
        
        
        
       
    }
    
}
