public class TestingShort {
    static boolean add_fcn(short x, short y) {
        short sum = (short)(x + y);
        if (sum <= 0) {
            return false;
        }
        else{
            return true;
        }
    }

    static boolean add_int(int x, int y) {
        int sum = x + y;
        if (sum <=0) {
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        short x = 32760;
        short y = 32760;
        if (add_fcn(x,y) == true){
            System.out.println("There is no overflow");
        }else {
            System.out.println("There is overflow");
        }
        int a = 12345;
        int b = 98765;
        if (add_int(a,b) == true) {
            System.out.println("There is no overflow");
        }else {
            System.out.println("There is overflow");
        }
    }
}