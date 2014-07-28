#include <cstdlib>
#include <iostream>
#include <fstream>
#include <iomanip>
using namespace std;

int main()
{

// i/o file variable names
   ifstream inFile;
   ofstream outFile;

   const int size = 60;
   char path[size];
int hours;
string Beg_Date[size];
   string End_Date[size];
   char emplyName[size];
   char jobTitle[size];
   char dateHired[size];
   char contactPhone[size];
   char primAddress[size];
   double PayRate, PayRate2, PayRate3, PayRate4, PayRate5;
   double CkTotal, CkTotal2, CkTotal3, CkTotal4, CkTotal5;
   double TotalPayroll = 0.0;

cout << "\t\t========================\n";
   cout << "\t\t PAYROLL REPORT.\n";
cout << "\t\t========================\n";

cout << endl;
   cout << "\t\tEnter file path... ";
   cin >> path;

inFile.open(path);// opens desired file.

//File paths are not validated
  
if (!inFile)
       { cout << "\t\tFile could not be found...\n\n";
       system("pause");
       exit (EXIT_FAILURE);
       }


   //ignores everything
   inFile.ignore(500, '\'');

cout << endl;
   cout << "\t\tEnter output file... ";
       cin >> path;
       outFile.open(path);

cout << endl;
cout << "\tEnter the period of time you want this report to begin on. \n";
       cout << "\tEx:dec20,2009(do not put any spaces)..." << endl;       //ask user to enter the date, that they wish the payroll report to start at:
   cin >> Beg_Date[size];
       cout << endl;
       cout << "\tEnter the date you want this report to end on... \n";
       cout << "\tEx:dec25,2009(do not put any spaces)..." << endl; //ask user to enter the date, that they wish the payroll report to end at:
       cin >> End_Date[size];
system("pause");

  
inFile.getline(emplyName, size, '\'');

       outFile << "=================================================================================\n";
       outFile << "\t\t\t PAYROLL REPORT for " << Beg_Date << " - " << End_Date << "." << endl;
       outFile << "=================================================================================\n";
// can't get the payroll to output correctly the first one yes the others are out of sync
outFile << "\tEmployee Name: \t" << emplyName << endl;
       cout << "\tHours worked by employee:" << emplyName << endl;
       cin >> hours;

       inFile.ignore(50, '\'');
       inFile.getline(jobTitle, size, '\'');;
       outFile << "\tJob Title:\t" << jobTitle << endl;

       inFile.ignore(50, '\'');
       inFile.getline(dateHired, size, '\'');
       outFile << "\tDate Hired:\t" << dateHired << endl;

inFile.ignore(50, '\'');
       inFile.getline(contactPhone, size, '\'');
       outFile << "\tContact Phone:\t" << contactPhone << endl;


inFile.ignore(50, '\'');
       inFile.getline(primAddress, size, '\'');
       outFile << "\tPrimary Address:\t" << primAddress << endl;

inFile.ignore(50, '$');
       inFile >> PayRate;
       outFile << "\tPay Rate:\t" << PayRate << endl;

       outFile << "\tHours worked: " << hours << endl;

       CkTotal = hours * PayRate;
       outFile << "\tCheck Amount: " << CkTotal << endl;

       outFile << "\t====================================================\n";
inFile.ignore(50, '\'');
outFile << "\tEmployee Name: \t" << emplyName << endl;
       cout << "\tHours worked by employee:" << emplyName << endl;
       cin >> hours;

       inFile.ignore(50, '\'');
       inFile.getline(jobTitle, size, '\'');;
       outFile << "\tJob Title:\t" << jobTitle << endl;

       inFile.ignore(50, '\'');
       inFile.getline(dateHired, size, '\'');
       outFile << "\tDate Hired:\t" << dateHired << endl;

inFile.ignore(50, '\'');
       inFile.getline(contactPhone, size, '\'');
       outFile << "\tContact Phone:\t" << contactPhone << endl;


inFile.ignore(50, '\'');
       inFile.getline(primAddress, size, '\'');
       outFile << "\tPrimary Address:\t" << primAddress << endl;

inFile.ignore(50, '$');
       inFile >> PayRate2;
       outFile << "\tPay Rate2:\t" << PayRate2 << endl;

outFile << "\tHours worked: " << hours << endl;

       CkTotal2 = hours * PayRate2;
       outFile << "\tCheck Amount: " << CkTotal2 << endl;

outFile << "=======================================\n";

outFile << "\tEmployee Name: \t" << emplyName << endl;
       cout << "\tHours worked by employee:" << emplyName << endl;
       cin >> hours;

       inFile.ignore(50, '\'');
       inFile.getline(jobTitle, size, '\'');;
       outFile << "\tJob Title:\t" << jobTitle << endl;

       inFile.ignore(50, '\'');
       inFile.getline(dateHired, size, '\'');
       outFile << "\tDate Hired:\t" << dateHired << endl;

inFile.ignore(50, '\'');
       inFile.getline(contactPhone, size, '\'');
       outFile << "\tContact Phone:\t" << contactPhone << endl;


inFile.ignore(50, '\'');
       inFile.getline(primAddress, size, '\'');
       outFile << "\tPrimary Address:\t" << primAddress << endl;

inFile.ignore(50, '$');
       inFile >> PayRate3;
       outFile << "\tPay Rate3:\t" << PayRate3 << endl;

outFile << "\tHours worked: " << hours << endl;

       CkTotal3 = hours * PayRate3;
       outFile << "\tCheck Amount: " << CkTotal3 << endl;

outFile << "\t============================================\n";

outFile << "\tEmployee Name: \t" << emplyName << endl;
       cout << "\tHours worked by employee:" << emplyName << endl;
       cin >> hours;

       inFile.ignore(50, '\'');
       inFile.getline(jobTitle, size, '\'');;
       outFile << "\tJob Title:\t" << jobTitle << endl;

       inFile.ignore(50, '\'');
       inFile.getline(dateHired, size, '\'');
       outFile << "\tDate Hired:\t" << dateHired << endl;

inFile.ignore(50, '\'');
       inFile.getline(contactPhone, size, '\'');
       outFile << "\tContact Phone:\t" << contactPhone << endl;


inFile.ignore(50, '\'');
       inFile.getline(primAddress, size, '\'');
       outFile << "\tPrimary Address:\t" << primAddress << endl;

inFile.ignore(50, '$');
       inFile >> PayRate4;
       outFile << "\tPay Rate4:\t" << PayRate4 << endl;

outFile << "\tHours worked: " << hours << endl;

       CkTotal4 = hours * PayRate4;
       outFile << "\tCheck Amount: " << CkTotal4 << endl;

outFile << "\t=============================================\n";

outFile << "\tEmployee Name: \t" << emplyName << endl;
       cout << "\tHours worked by employee:" << emplyName << endl;
       cin >> hours;

       inFile.ignore(50, '\'');
       inFile.getline(jobTitle, size, '\'');;
       outFile << "\tJob Title:\t" << jobTitle << endl;

       inFile.ignore(50, '\'');
       inFile.getline(dateHired, size, '\'');
       outFile << "\tDate Hired:\t" << dateHired << endl;

inFile.ignore(50, '\'');
       inFile.getline(contactPhone, size, '\'');
       outFile << "\tContact Phone:\t" << contactPhone << endl;


inFile.ignore(50, '\'');
       inFile.getline(primAddress, size, '\'');
       outFile << "\tPrimary Address:\t" << primAddress << endl;

inFile.ignore(50, '$');
       inFile >> PayRate5;
       outFile << "\tPay Rate5:\t" << PayRate5 << endl;

outFile << "\tHours worked: " << hours << endl;

       CkTotal5 = hours * PayRate5;
       outFile << "\tCheck Amount: " << CkTotal5 << endl;

outFile << "\t==================================================\n";

   TotalPayroll = CkTotal + CkTotal2 + CkTotal3 + CkTotal4 + CkTotal5;
       outFile << "\tTotal Payroll: $" << TotalPayroll << endl;


       inFile.close();
       outFile.close();
      

  
system ("pause");
return EXIT_SUCCESS;

}