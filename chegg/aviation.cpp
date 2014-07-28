#include<iostream>
using namespace std;
int main()
{
   char *b[26]; //Declaring an array of strings
   //initialising the array with the given
   //strings
   b[0]="Alpha";b[1]="Bravo";b[2]="Charlie";
   b[3]="Delta";b[4]="Echo";b[5]="Foxtrot";
   b[6]="Golf";b[7]="Hotel";b[8]="India";
   b[9]="Juliet";b[10]="Kilo";b[11]="Lima";
   b[12]="Mike";b[13]="November";b[14]="Oscar";
   b[15]="Papa";b[16]="Quebec";b[17]="Romeo";
   b[18]="Sierra";b[19]="Tango";b[20]="Uniform";
   b[21]="Victor";b[22]="Whiskey";b[23]="X-Ray";
   b[24]="Yankee";b[25]="Zulu";
   char input; //variable to take input
   cout<<"Input a letter to know its ICAO word!\n";
   cin>>input;
   if(input<='Z'&&input >='A')input = input - 'A';//to convert A to 0 ,
   //B to 1, C to 2 and so on...
   else if(input>='a'&& input<='z')input = input - 'a'; // same thing for lowercase characters
   else
   {
       cout<<"Enter a valid character";return 0;
   }
   cout<<"Corresponding ICAO word is :"<<b[input];
   return 0;
}