import java.lang.Math;
import java.util.*;
public class test{

    public static void rps(int i){
        int rand = (int)(Math.random() * 3);
        if (rand == 0){
            //rock
            if (i == 1){
                System.out.println("The computer picked rock!");
                System.out.println("You're a Winner!");
            }
            else{
                System.out.println("The computer picked rock!");
                System.out.println("You loose!");
            }
        }
        else if (rand == 1){
            //paper
            if (i == 2){
                System.out.println("The computer picked paper!");
                System.out.println("You're a Winner!");
            }
            else{
                System.out.println("The computer picked paper!");
                System.out.println("You loose!");
            }
        }
        else if (rand == 2){
            //scissors
            if (i == 0){
                System.out.println("The computer picked scissors!");
                System.out.println("You're a Winner!");
            }
            else{
                System.out.println("The computer picked scissors!");
                System.out.println("You loose!");
            }
        }
    }

    public static void main(String[] args){
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Rock, Paper Scissors Game! You will play the computer!");
        System.out.print("Type 0 to choose rock, 1 to choose paper and 2 to choose scissors     ");
        result = sc.nextInt();
        
        rps(result);
    }
}