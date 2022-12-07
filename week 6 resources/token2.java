import java.util.*;
import java.io.*;

public class token2{
public static void main(String []args){
    

    String code = "i2bc=i+a3+( C + D3) ;"; 
    int length = code.length();
    ArrayList<String> tokens = new ArrayList<String>();
    
    for (int i = 0; i < length;){
        Character x = code.charAt(i);
        String y = "";
        
       while  (!x.equals("+") || !x.equals("=") || !x.equals("-") || !x.equals("*") || !x.equals("(")|| !x.equals(")") || !x.equals(";"))
    {
        y = y +x;
        break; 
    }
  
        if (x.equals("=")) {
            y = "=";
            i++;
           
            
        } 
        else if (x.equals("+")) {
            y = "+";
            i++;
           
        }

        else if (x.equals("(")) {
            y = "(";
            i++;
            
        }

        else if (x.equals(")")) {
            y = ")";
            i++;
           
        }

        else if (x.equals(" ")) {
            y = null;
            i++;
        }

        else if(x.equals(";")) {
            y = ";";
            i++;
            
        }

        tokens.add(y);
        i++;
    }


    System.out.println(tokens);
    
    }
}