
import java.util.*;

public class game{
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        int score = 0;
        int total = 6;
        
        Scanner sc = new Scanner(System.in);

        //System.out.println("");

        System.out.println("You are in a forest, you do not know how you got there...");
        System.out.println("You hear a loud scream behind you");
        System.out.println("Do you run, or hide?        ");

        String decide = sc.next();
        
        if (decide.contains("run")){
            stack.push("run");
            score = score +1;
            
            System.out.println("You run and run as fast as you can hearing footsteps behind you");
            System.out.println("After a while of running the footsteps fade, you are alone");
            System.out.println("When you catch your breath you see a small hut in the distance");
            System.out.println("Do you go towards the hut or keep going straight?       ");

            decide = sc.next();
           
            if (decide.contains("hut")){
                stack.push("hut");
                score = score + 1;
                
                System.out.println("you walk up to the hut, knock on the door....");
                System.out.println("no answer");
                System.out.println("You push the door and by your luck it is unlocked");
                System.out.println("Do you explore the main floor or the basement?  ");

                decide = sc.next();
                if (decide.contains("basement")){
                    stack.push("basement");
                    score = score + 2;
                    

                    System.out.println("You walk to the basement doors no where near the kitchen");
                    System.out.println("You open the door and try to turn on the light but it does not work");
                    System.out.println("You slowly go down the large staircase");
                    System.out.println("You feel the walls trying to get a grasp of where you are");
                    System.out.println("Suddenly a small blue light emerges...");
                    System.out.println("You go towards the light and when you reach into it you find...");
                    System.out.println("A magic 8 ball!");

                    stack.push("8-ball winner");
                    System.out.println("Congratulations");

                }
                if (decide.contains("main")){
                    stack.push("main floor");
                    score = score + 1;
                    System.out.println("You're walking around carefully making sure no one is in the hut");
                    System.out.println("You explore the living room");
                    System.out.println("Nothing but dusty photos of weird looking children in there");
                    System.out.println("You start heading to the kitchen when...");
                    System.out.println("BOOM. Floor falls out from beneath you");

                    stack.push("dead");

                }


            }
            if (decide.contains("straight")){
                stack.push("straight");
                score = score + 1;

                System.out.println("You keep running past the hut hoping to find some end to this madness");
                System.out.println("You look behind you to see if anyone is following");
                System.out.println("While your head is turned you run into a tree");
                stack.push("dead");


            }
            else{
                stack.push("invalid");
            }
            
         
        }

        else if (decide.contains("hide")){
            stack.push("hide");
            score = score + 1;
            System.out.println("You hide for a while...");
            System.out.println("You havent heard anything for a long time now...");
            System.out.println("You come out of hiding to see if the coast is clear");
            System.out.println("You get shot in the head with an arrow");
            stack.push("dead");
            

        }

        else{
            stack.push("invalid");
        }

        System.out.println("Here are the choices you made:");
        System.out.println(stack);
        System.out.println("Your score is " + score + "/" + total );
        
        sc.close();
    }
}