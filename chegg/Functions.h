#include <iostream>
#include <fstream>
#include <string>
#include <iomanip>
using namespace std;

struct book
{
   int ISBN;
   string Author;
   string Title;
   int Quantity;
   double price;
};

void choice1(book books[],int& size, int Max_size)
{
   ifstream inFile;
   inFile.open("inventory.dat");

   while (!inFile.eof())
   {
       for(size=0;size<Max_size;size++)
       {
        inFile >> books[size].ISBN;
        getline(inFile,books[size].Author);
        getline(inFile,books[size].Title);
        inFile >> books[size].Quantity;
        inFile >> books[size].price;
       }
   }
   cout << "You have successfully read the file" << endl;
}
