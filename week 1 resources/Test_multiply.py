
def __init__(self):
    #instance fields found by Java to Python Converter:
    self.const = 0
    self.namespace = None

# file: mult_recursive1.cpp 
# test a recursive function
#
# (1) multiplication of two natural numbers m and n, m , both less than 10
#
#      m * n = m if n = 1
#            = m + (n - 1) * m
#

#JAVA TO PYTHON CONVERTER TODO TASK: The following line could not be converted:
#include <iostream> #include <stdlib.h> int const M_MAX = 1000;

int self.mult_rec(int, int)
int self.mult_iter(int, int)

using self.namespace std

int self.main()

    cout << "Enter two natural numbers m and n both less than\n " << M_MAX << " and " << N_MAX << ":\n"
    n = None
    m = None
    cin >> m >> n
    #
    if m <= 0 or n <= 0:
        cout << "ERROR, end of program, numbers should be greater than 0	\n"
        system("PAUSE")
        return 0
    else:
        if m > M_MAX or n > N_MAX:
            cout << "ERROR, end of program, numbers should be smaller than " << "M_MAX = " << M_MAX << " and N_MAX = " << N_MAX << "   \n"
            system("PAUSE")
            return 0
        else:

            cout << "Result 1, simple multiplication: m * n is " << m*n << endl
    cout << "Result 2, recursive multiplication, see (1), is " << self.mult_rec(m, n) << endl
    cout << "Result 3, iterative multiplication, is " << self.mult_iter(m, n) << endl
    system("PAUSE")
    return 0

int self.mult_rec(int k, int j)
    if j == 1:
        return k
    else:
        return (k + self.mult_rec(k, j-1))

int self.mult_iter(int k, int j)

    prod = 0

    x = 1
    while x <= j:
        prod = prod + k
        x += 1
    return prod
#
#
#Enter two natural numbers m and n both less than
# 1000 and 1000:
#5 20
#Result 1, simple multiplication: m * n is 100
#Result 2, recursive multiplication, see (1), is 100
#Result 3, iterative multiplication, is 100
#Press any key to continue . . .
