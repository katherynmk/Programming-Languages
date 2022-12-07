import java.util.*;
public class wct {
    public static void main(String[] args){
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a weight in lbs and we will convert it!    ");
       
        result = sc.nextInt();

        //grams
        System.out.println("The weight in grams is: " + (result*453.592));
        //kilograms
        System.out.println("The weight in kilograms is:   " + (result*0.000453592));
        //ounces 
        System.out.println("The weight in ounces is:   " + (result*16));
    }
}
