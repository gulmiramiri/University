/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package show_empploe_info;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Show_empploe_info {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("ENter emmpolyee name");
        String name = input.next();
        
        System.out.println("Enter number of hour worked in week ");
        double Hour_week = input.nextDouble();
        
        
        System.out.println("Enter hourly pay");
        double pay_hour = input.nextDouble();
        
        System.out.println("ENter federal task");
        double task = input.nextDouble();
        
        System.out.println("Enter state task");
        double statetask = input.nextDouble();
        
        double total_pay = Hour_week * pay_hour;
        double fidralwi = total_pay * task;
        double statewi = total_pay * statetask;
        
        System.out.println("Empoyee name :"+name);
        System.out.println("Hour WOrk " + Hour_week);
        System.out.println("Pay rate " + pay_hour);
        System.out.println("Gross pay "+ (total_pay));
        
        System.out.println("Discation :");
        
        System.out.println("\t Fediral Wetihing "  +(fidralwi));
        System.out.println("\t State wainthing " + (statewi));
        System.out.println("\t Total Dedution "+ fidralwi + statewi);
    }
    
}
