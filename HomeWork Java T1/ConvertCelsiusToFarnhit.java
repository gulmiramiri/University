
package convertcelsiustofarnhit;
import java.util.Scanner;


public class ConvertCelsiusToFarnhit {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter celsius to convet Fahrenhrit :");
        float celsius = input.nextFloat();
        
        float convert = (celsius * 9/5) + 32 ;
        
        System.out.print("Your convert is " + convert);
        
    }
    
}
