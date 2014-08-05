#include<stdio.h>
int isPrime(int);
 
main()
{
   int n, result;
   int m, i = 3, count, c;
 
   printf("Enter an integer to check whether it is prime or not.\n");
   scanf("%d",&n);
 
   result = isPrime(n);
 
   if ( result == 1 )
      printf("%d is prime.\n", n);
   else
      printf("%d is not prime.\n", n);

   printf("Enter the number of prime numbers required\n");
   scanf("%d",&m);

   if ( m >= 1 )
   {
      printf("First %d prime numbers are :\n",m);
      printf("1\n");
      printf("2\n");
   }

   for ( count = 2 ; count <= m ;  )
   {
      for ( c = 2 ; c <= i - 1 ; c++ )
      {
         if ( i%c == 0 )
            break;
      }
      if ( c == i )
      {
         printf("%d\n",i);
         count++;
      }
      i++;
   }

 
   return 0;
}
 
int isPrime(int a)
{
   int c;
 
   for ( c = 2 ; c <= a - 1 ; c++ )
   { 
      if ( a%c == 0 )
     return 0;
   }
   if ( c == a )
      return 1;
}