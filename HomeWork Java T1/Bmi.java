
package bmi;

import java.util.Scanner;


public class Bmi {

    public static void main(String[] args) {
        
        Scanner input = new  Scanner(System.in);
        
        double height , width , bmi ;
        
        System.out.println("Enter your height :");
        height = input.nextDouble();
        
        
        System.out.println("Enter your Widht :");
        width = input.nextDouble();
        
        bmi = width / (height * height);
        
        if (bmi < 18.5 ){
            System.out.println("You are underwidth ");
        }
        else if (bmi < 25){
            System.out.println("You are normal");
        }
        
        else if (bmi < 30 ){
            System.out.println("You are overwidth");
        }
        
        else {
            System.out.println("You are obese");
        }
        
        
        
        
        
    }
    
}
