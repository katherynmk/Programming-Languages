import java.util.Scanner;

class Test_multiply{


	static int mult_rec (int k, int j) {
		if (j == 1)
		return k;
	 else
		return (k + mult_rec (k, j-1));
	}

	static int mult_iter (int k, int j){
		int prod = 0;
	
		for ( int x = 1; x <= j; x++)
		{
			prod = prod + k;
		}
		return prod;
	}
	public static void main(String args[]) {
		int m_max= 1000;
		int n_max= 1000;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two natural numbers m and n both less than 1000");
		int n = sc.nextInt();
		int m = sc.nextInt();

		if (m <= 0 || n <= 0)
		{
			System.out.println("ERROR, end of program, numbers should be greater than 0");
			
			
		}else

		if (m > m_max || n > n_max)
		{
			System.out.println("ERROR, end of program, numbers should be smaller than 1000"); 
		} else
		System.out.println("Result 1, simple multiplication: m * n is " + m*n);
		System.out.println("Result 2, recursive multiplication, see (1), is " + mult_rec(m,n));
		System.out.println("Result 3, iterative multiplication, is " + mult_iter(m,n));
		sc.close();
	}
}