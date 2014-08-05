#include <iostream> 
#include <vector>
using namespace std;
 
class CarbonFootprint {
   protected:
      int miles_driven;
      int miles_per_gallon; 
      int no_of_days;
      int no_of_people;
      int gas_con;
      int elec_con;
   public:
      CarbonFootprint(int a, int b)
      {
         miles_driven = a;
         miles_per_gallon = b;
      }
      CarbonFootprint(int a, int b, int c)
      {
         no_of_people = a;
         elec_con = b;
         gas_con = c;
      }

      // pure virtual function
      virtual void getCarbonFootprint() = 0;
};

class Building: public CarbonFootprint{
   public:
      Building( int a=0, int b=0, int c=0) : CarbonFootprint(a, b, c) { }
      void getCarbonFootprint()
      { 
         cout << "Carbon footprint of building is : " << (1.222*elec_con*0.00045 + gas_con*12*0.012*0.00045)/no_of_people << " tonnes CO2.";
      }
};
class Car: public CarbonFootprint{     
   public:
      Car(int a, int b) : CarbonFootprint(a,b) 
      { 
         miles_driven = a;
         miles_per_gallon = b;
      }
      void getCarbonFootprint()
      { 
         cout << "Carbon footprint of car is : " << (miles_driven/miles_per_gallon) * 19.8 << " lbs. or " << (miles_driven/miles_per_gallon) * 19.8 * 0.00045 <<" tonnes."<<endl;
      }
};
class Bicycle: public CarbonFootprint{
   public:
      Bicycle( int a=0, int b=0):CarbonFootprint(a, b) 
      {
         miles_driven = a;
         no_of_days = b;
      }
      void getCarbonFootprint()
      { 
         cout << "By cycling to work you save " << miles_driven * no_of_days << "lbs. of CO2 emissions" << endl;
      }
};

// Main function for the program
int main( )
{
   vector <CarbonFootprint*> carbon;

   int miles1 = 0;
   int miles2 = 0;
   int mpg = 0;
   int days = 0;
   int occ = 0;
   int elec = 0;
   int gas = 0;
   cout << "Enter the miles driven in the car in a year : "; 
   cin >> miles1;
   cout << "Enter the average in miles per gallon : " ;
   cin >> mpg;
   Car c(miles1, mpg);
   carbon.push_back(&c);
   cout << endl;
   cout << "Enter the distance to your office (in miles): " ;
   cin >> miles2;
   cout << "How many days do you bike to work? ";
   cin >> days;
   Bicycle b(miles2, days);
   carbon.push_back(&b);
   cout << endl;
   cout << "Enter number of occupants of the building : " ;
   cin >> occ;
   cout << "Enter annual electricity usage (in KilloWatts/hour) : ";
   cin >> elec;
   cout << "Enter annual gas usage (in KilloWatts/hour) : ";
   cin >> gas;
   Building bb(occ, elec, gas);
   carbon.push_back(&bb);
   cout << endl;
   // display carbon footprint of each object
   for ( size_t i = 0; i < carbon.size(); i++ ){
      carbon[i]->getCarbonFootprint();
      cout << endl;
   }

   //release elements of list
   for ( size_t i = 0; i < carbon.size(); i++ ){
      //TODO: release elements in the list
      CarbonFootprint* ptr;
      delete ptr;
   }

   return 0;
}