/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package high_scour;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class High_Scour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of student");
        int numb = input.nextInt();
        
        String topStudent = "";
        double topSocore = 0;
        
        for (int i = 0 ; i < numb ; i++){
            System.out.println("Enter name of student");
            String name = input.next();
            
            System.out.println("Enter the socore");
            double socore = input.nextDouble();
            
            if (socore > topSocore){
                topSocore = socore;
                topStudent= name;
            }
            
            
        }
        
        System.out.println("Top student " + topStudent);
        System.out.println("Top score " + topSocore);
    }
    
}
