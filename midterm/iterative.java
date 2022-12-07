public class iterative {
    public static int iter(int x){
        int counter = 1;
        if (x <= 1){
            return 1;
        }

        for (int i = 1; i <= x; i++){
            counter = counter * i;
        }
        int result = counter;
        return result;
    }

    public static void main(String []args){

        System.out.println(iter(2));
        System.out.println(iter(3));
        System.out.println(iter(4));
    }
}
