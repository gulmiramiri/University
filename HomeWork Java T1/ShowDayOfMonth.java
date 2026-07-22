/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showdayofmonth;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class ShowDayOfMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter year and month ");
        int year = input.nextInt();
        String month = input.next().toLowerCase();
        
        int day = 0 ;
        
        switch(month){
            case "jan" : day = 31;break;
            case "feb" :
                if((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0) )
                 day = 29                 ;
                
            
                else 
                    day = 28;
                
                break;
                
            case "mar" : day= 31 ; break;
            case "apr" : day= 30 ; break;
            case "may" : day= 31 ; break;
            case "jun" : day= 30 ; break;
            case "jul" : day= 31 ; break;
            case "aug" : day= 31 ; break;
            case "sep" : day= 30 ; break;
            case "oct" : day= 31 ; break;
            case "nov" : day= 30 ; break;
            case "dec" : day= 31 ; break;
                
            default:System.out.println("Invilidmonth");
                
            
                
        }
                System.out.println(day);
        
    }
    
}
