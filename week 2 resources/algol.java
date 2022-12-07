import java.util.Scanner;
import java.util.*;
// ok so this code in ALGOL, I hate it
//Im going to do the same thing as the program wants to acomplish,
//but not with the same exact way? maybe? ALGOL is hard to read
public class algol{
    public static void main(String args[]) {
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        int listlen,  average, result = 0;
        int counter = 0;
        int sum = 0;

        //read input into array and computer average
        Scanner sc = new Scanner(System.in);
        
        String end = "y";
        while (end.equalsIgnoreCase("y")){
            System.out.println("Please enter integers between 1 and 99 to add to the array");
            listlen = sc.nextInt();
            
            if (listlen < 100 && listlen > 0){
                counter ++;
                sum ++;
                intlist.add(listlen);
                System.out.println("Add another integer? (Y)es (N)o");
                end = sc.next();
            }
            else{
                break;
            }
        }
            //computer the average 
            average = sum/counter;
            for(int i = 0; i < intlist.size(); i++){
                if (intlist.get(i) > average){
                    result = result + 1;
                }
            }

            System.out.println("The number of values above the average is " + (result-1));
        }   

    
}