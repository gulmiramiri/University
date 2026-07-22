/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package show_calender;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Show_Calender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter year");
        int year = input.nextInt();
        
        System.out.println("Enter first day of week");
        int firstDay = input.nextInt();
        
        String[] month = {"January" , "February" , "March" , "April" , "May" , "June" , "July" , "Aguest" , "September" , "October" , "November" , "December"};
    
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            daysInMonth[1] = 29;
        }
        
        int cont =0;
        
        for (int m = 0 ; m<12 ; m++){
            System.out.print(month[m]  +" "+ year + "\n--------------------------------------------------------------------------------------------\n");
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            for(int i = 0 ; i<=firstDay ;i++){
                System.out.print(" ");
                
                
            }
            
            for (int day = 1 ; day <= daysInMonth[m];day++){
                System.out.printf("%3d" , day);
                firstDay++;
                if(firstDay % 7 ==0){
                    System.out.println();
                }
            }
            
            System.out.println();
            firstDay%=7;
               
        }
        
    
    }
    
}

//        int cou=0;
//        System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
//        for (int i = 1 ; i < 31 ; i++){
//            System.out.print("\t"+i);
//            cou++;
//            if(cou % 7 ==0){
//                System.out.println();
//            }
//        }