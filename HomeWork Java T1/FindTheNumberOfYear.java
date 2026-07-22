
package findthenumberofyear;

import java.util.Scanner;


public class FindTheNumberOfYear {


    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of minite");
        long minite = input.nextLong();
        
        
        // total min in year
        long min_in_year = 525600;
        
        long year = minite / min_in_year;
        long riminingMINITE = minite % min_in_year;
        long day = riminingMINITE / 1440;
        
        
        System.out.println(minite + " minutes is " + year + " year and " + day + " day");
        
        
        
    }
    
}
