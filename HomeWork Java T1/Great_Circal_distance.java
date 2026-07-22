/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package great_circal_distance;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Great_Circal_distance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        
        final double  RADIUS = 6371.01;
        
        System.out.println("Tnter point1 (latitude and long latitude in deggree)");
        double x1 = Math.toRadians(input.nextDouble());
        double y1 = Math.toRadians(input.nextDouble());
        
        System.out.println("Tnter point2 (latitude and long latitude in deggree)");
        double x2 = Math.toRadians(input.nextDouble());
        double y2 = Math.toRadians(input.nextDouble());
        
        
        
        double distance = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2) );
        
        
        System.out.println("Distance is " + distance);
    }
    
}
