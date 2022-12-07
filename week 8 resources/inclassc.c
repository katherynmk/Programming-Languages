/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <math.h>
#include <stdio.h>
using namespace std;


void cube();
void cube(int x) {
  cout << "The volume is " << pow (x, 3)  ;
  cout << "The surface area is " << 6 * (pow (x, 2)) ;
}

int main()
{
    cube(7);
    return 0;
}

