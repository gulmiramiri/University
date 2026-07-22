/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

/**
 *
 * @author dell
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0;
        int number = 2;
        
        while(count < 50){
            boolean isPrime = true;
            
            for (int i = 2 ; i <= number / 2 ; i++){
                if (number % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
    
}
