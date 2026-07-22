/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petagon_point;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Petagon_Point {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Tnter the radius  bounding circal ");
        double radius = input.nextDouble();
        
        
        for (int i = 0 ; i < 5 ; i++){
            double angle = Math.toRadians(90 - i * 72);
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);
            
            System.out.println("p" + i+1 + "\t" + x + "\t" + y);
        }
    }
    
}
