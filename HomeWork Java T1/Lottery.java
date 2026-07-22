
package lottery;

import java.util.Scanner;


public class Lottery {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int lottery = (int) (Math.random()*100); 
        
        System.out.println("Enter 2 digit number to lotery ");
        int get_num = input.nextInt();
        
        
        int get_digit_1_guss = get_num / 10;
        int get_digit_2_guss = get_num % 10;
 
        
        int get_digit_1_lottery = lottery / 10 ;
        int get_digit_2_lottery = lottery % 10 ;
        
        
        if(lottery == get_num){
            System.out.println("You are win 10000$");
        }
        else if (get_digit_1_guss == get_digit_1_lottery && get_digit_2_guss == get_digit_2_lottery){
            System.out.println("You are win 3000$");
        }
        
        
        else if (get_digit_1_guss == get_digit_1_lottery || get_digit_2_guss == get_digit_2_lottery){
            System.out.println("You are win 1000$");
        }
        
        else {
            System.out.println("You are not win");
        }
        
        
        
        
    }
    
}
