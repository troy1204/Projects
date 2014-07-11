#include <iostream>
using namespace std;
void displayMenu();
double fahrenheitToCelcius(double fTemp);
double milesToKilometers(double miles);
double litersToGallons(double liters);

int main()
{
  int ch;
  double input = 0.0;
  double result = 0.0;
  cout << " \t\t\t\t\t\tWelcome to the Conversion Program " << endl;
  cout << " \t\t\t\t\t\t================================= " << endl;
  displayMenu();
  cin >> ch;
  switch(ch){
    case 1:
      cout << "Enter temperature in Fahrenheit : ";
      cin >> input;
      result = fahrenheitToCelcius(input);
      cout << "Temperature in Celsius = " << result << endl;
      break;
    case 2:
      cout << "Enter distance in miles : ";
      cin >> input;
      result = milesToKilometers(input);
      cout << "distance in kilometers = " << result << endl;
      break;
    case 3:
      cout << "Enter quantity in litres : ";
      cin >> input;
      result = litersToGallons(input);
      cout << "quantity in gallons = " << result << endl;
      break;
    case 4:
      exit(0);
    default : 
      cout << "Invalid choice!" << endl;
  }
  return 0;
}

void displayMenu(){
  cout << "1. Fahrenheit to Celsius" << endl;
  cout << "2. Miles to kilometers" << endl;
  cout << "3. Liters to Gallons" << endl;
  cout << "4. Exit from the program" << endl;
}

double fahrenheitToCelcius(double fTemp) {
  return (fTemp - 32) * 5.0 / 9.0;
}

double milesToKilometers(double miles) {
  return miles * 1.609344;
}

double litersToGallons(double liters) {
  return liters * 0.264;
}