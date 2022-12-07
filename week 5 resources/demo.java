import java.util.StringTokenizer;  
class Demo{
    public static void main(String args[]){
        
            StringTokenizer tokens = new StringTokenizer("{ int a; a = 25 int b = 3; b = a + b; count << 'b is ' << b; count << end1; return 0; }"," ");  
              while (tokens.hasMoreTokens()) {  
                  System.out.println(tokens.nextToken());  
              }  
            }  
         }  