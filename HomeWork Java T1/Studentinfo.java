/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinfo;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Studentinfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Two letter");
        String letter = input.next().toLowerCase();
        
        if (letter.length() != 2){
            System.out.println("Invilid Input");
        }
        
        char char1 = letter.charAt(0);
        char char2 = letter.charAt(1);
        
        String majorname = "";
        
        if (char1 == 'm'){
            majorname = "Math";
        }
        
        else if (char1 == 'c'){
            majorname = "Computer since";
        }
        else if (char1 == 'i'){
            majorname = "Information Technology";
        }
        
        else{
            System.out.println("Valid input");
        }
        
        String majornameY = "";
        if (char2 == '1'){
            majornameY = "1 year";
        }
        
        else if (char2 == '2'){
            majornameY = "2 Year";
        }
        else if (char2 == '3'){
            majornameY = "3 Year";
        }
        else if (char2 == '4'){
            majornameY = "4 Year";
        }
        
        else{
            System.out.println("Valid input");
        }
        
        
        System.out.println(majorname + " " + majornameY);
        
        
        
    }
    
}
