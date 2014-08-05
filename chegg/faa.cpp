#include <iostream>
#include <string>
using namespace std;

int main()
{
char s[ ] = "123abc456def789ghi";
char r[40];
cout<<"The string s contains "<<s<<endl;
cout<<"The length of s equals "<<strlen(s)<<endl<<endl;
strcpy(r,s);
cout<<"The string r contains "<<r<<endl;
cout<<"The length of r equals "<<strlen(r)<<endl<<endl;
strncpy(r,"XXXXXX",3);
cout<<"The string r contains "<<r<<endl<<endl<<endl;
strcpy(r,"abcdef");
cout<<"Now the string r contains "<<r<<endl;
cout<<"The current length of r equals "<<strlen(r)<<endl<<endl;
strcat(r,r);
cout<<"Now the string r contains "<<r<<endl;
cout<<"Now the current length of r equals "<<strlen(r)<<endl<<endl;
return 0;
}