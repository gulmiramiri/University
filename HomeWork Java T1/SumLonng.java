/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumlonng;

/**
 *
 * @author dell
 */
public class SumLonng {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        int z = i + 2;
        int x = 0 ;
        for (int v = 1 ; v<=97;v+=2){
            x = i / z;
            i++;
        }
        
        System.out.println(x);
    }
    
}
