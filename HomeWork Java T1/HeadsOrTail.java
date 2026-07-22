/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heads.or.tail;

/**
 *
 * @author dell
 */
public class HeadsOrTail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int head =0;
        int tail = 0;
        for (int i = 0 ; i < 1000000; i++){
            int h = (int)(Math.random() * 2);
            
            if (h==0){
                head++;
            }
            else{
                tail++;
            }
            
        }
        
        System.out.println("Head is "+ head);
        System.out.println("Tail is " + tail);

    }
    
}
