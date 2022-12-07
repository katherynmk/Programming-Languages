
    public class recursive {
        public static int recursion(int x) {
            if ( x < 1){
       
                return 1;
       
            }
            else{
       
                return x * recursion(x-1);
       
            }
        }
     
        public static void main(String []args){
     
            System.out.println(recursion(2));
            System.out.println(recursion(3));
            System.out.println(recursion(4));
        }
    }
    