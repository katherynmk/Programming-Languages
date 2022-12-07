import java.util.*;
import java.io.*;

public class token{
public static void main(String []args){
    String code; 
    ArrayList<String> end = new ArrayList<String>();

    Scanner sc = new Scanner(System.in);
    //System.out.print("Please enter your code:   ");
    //code = sc.nextLine();

    code = "{ int a; a = 25 int b = 3; b = a + b; count << 'b is ' << b; count << end1; return 0; }"; 
    
    String[] tokens = code.split("\\s+");
    
    
    for (int i = 0; i < tokens.length; i++) {
        if (tokens[i].contains(";")){
            String x = tokens[i].replace(";", "");
            end.add(x);
            end.add(";");   
        }

        else if (tokens[i].contains("'")){
            String y = tokens[i].replace("'", "");
            end.add("'");  
            end.add(y); 
        }
        else{
            end.add(tokens[i]);
        }
    }
    System.out.println(end);
    }
}