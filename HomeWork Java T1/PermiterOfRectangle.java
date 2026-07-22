
package permiterofrectangle;
import java.util.Scanner;

public class PermiterOfRectangle {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length :");
        float length = input.nextFloat();
        
        System.out.print("Enter the Width :");
        float width = input.nextFloat();
        
        double area = (length + width) * 2;
        
        System.out.println("The area of Rectangle is " + area);
        
        
        
    }
     
    
}
