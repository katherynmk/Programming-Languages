/* File: readsource.cpp
/* getc example: money counter */
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string>
#include <iostream>

using namespace std;

int main ()
{
  
  
  FILE * pFile;
  int c;
  string plines = ""; /* Program lines */
  int n = 0;
  int nl=0; /* number of lines */
  int ncr = 0; /* number of CR */
  int ntab = 0; /* number of h tabs */
  int nother = 0; /* number of other chars */
  pFile=fopen ("myfile.txt","r");
  if (pFile==NULL) perror ("Error opening file");
  else
  {
    do {
      c = getc (pFile);
      if (c == '$') 
	  	n++;
      else if (c == 0xA) 
      {
	  	nl++;
	  }
      else if (c == 0xD) 
	  	ncr++;
      else if (c == 0x9) 
	  	ntab ++;
	  else
	  	nother ++;
	  plines +=  char (c);
    } while (c != EOF);
    fclose (pFile);
    printf ("File contains %d$.\n",n);
    printf ("File contains %d new lines\n", nl);
    printf ("File contains %d carriage returns\n", ncr);
    printf ("File contains %d horizontal tabs\n", ntab);
    printf ("File contains %d other chars\n", nother);
    
    cout << "Program is as follows: \n\n" << plines << endl;
    
   
    
    		
    
  }
  
  return 0;
}
/*
hex D, carriage return
hex A, line feed
hex 9, horizontal tab
*/
