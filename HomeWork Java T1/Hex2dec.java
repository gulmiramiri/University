
package hex2dec;


public class Hex2dec {


    public static void main(String[] args) {
        
        System.out.println(hex2dece("23FA"));
        
        
    }
    
    public static int hex2dece(String hexVlue){
        int decVlue = 0;
        
        for (int i = 0; i < hexVlue.length(); i++){
            char hexChar = hexVlue.charAt(i);
            decVlue = decVlue * 16 + charhex2dec(hexChar);
            
           
        }
        return decVlue;
    }
    
    public static int charhex2dec(char ch){
        if (ch >= 'A' && ch <= 'F'){
            return 10 + ch - 'A';
        }
        else{
            return ch - '0';
        }
    }
    
}
