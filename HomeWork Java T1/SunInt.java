
package sunint;

import java.util.Scanner;


public class SunInt {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter int to sum enter 0 to stop");
        int data = input.nextInt();
        int sum = 0;
        
        while (data!= 0){
            sum+=data;
            
            data = input.nextInt();
        }
        
        System.out.println(sum);
       
        
        
    }
    
}
