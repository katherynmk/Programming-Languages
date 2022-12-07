import java.util.*;
import java.io.*;

public class thursday_lab {

    public static void main(String []args){
        int c;
        int c_alpha;
        String plines = ""; /* Program lines */
        int n = 0;
        int nl=0; //number of lines
        int ncr = 0; //number of cr
        int ntab = 0; //number of tabs
        int nother = 0; //number of other characters
   
    
    try{
     String filename = "myfile.txt";
     Scanner sc  = new Scanner(new File(filename));
    

        while (sc.hasNextLine()) {
            nl = nl + 1;
            ncr = ncr + 1;

            plines = sc.next();

            if (plines.contains("   ")){
                ntab = ntab + 1;
            }
         
            c_alpha = plines.length();
            
            c = c + c_alpha;

        }

    }

    catch(Exception ex){
    System.out.println("Adj file not found");
}

    System.out.println("This file contains " + nl + " lines.");
    System.out.println("This file contains " + ncr + " carriage returns.");
    System.out.println("This file contains " + ntab + " horizontal tabs.");
    System.out.println("This file contains " + c + " characters total.");

    }
}