
package cheakleapyear;
import java.util.Scanner;

public class CheakLeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the year ");
        int year = input.nextInt();
        
        if (year % 4 == 0){
            System.out.print("This year is leap");
        }
        else if (year % 100 == 0 && year % 400 == 0){
            System.out.print("This year is leap");
        }
        else{
            System.out.print("This year is not leap");
        }
    }
    
}
