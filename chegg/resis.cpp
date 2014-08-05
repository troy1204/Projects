#include <iostream>
#include <string>
#include <iomanip>
#include "Resistor.h"
using namespace std;
int main (void){
    Resistor res1(100,"E48");
    res1.display();
    Resistor res2(400, "E96");
    res2.display();
    double r1, r2;
    string t1, t2;
    cout << "Enter new nominal resistance for Resistor 1 : ";
    cin >> r1;
    if(r1 < 0){
        res1.setNominalResistance(0.0);
    }
    else if(r1 > 1000000){
        res1.setNominalResistance(1000000.0);
    }
    else{
        res1.setNominalResistance(r1);
    }
    cout << "Enter new tolerance for Resistor 1. Choose E12/E24/E48/E96 :";
    cin >> t1;
    if(t1 == "E12"){
        res1.setTolerance(0.1);
    }
    else if(t1 == "E24"){
        res1.setTolerance(0.05);
    }
    else if(t1 == "E48"){
        res1.setTolerance(0.02);
    }
    else if(t1 == "E96"){
        res1.setTolerance(0.01);
    }
    else{
        res1.setTolerance(0.0);
    }
    cout << "Enter new nominal resistance for Resistor 2 : ";
    cin >> r2;
    if(r2 < 0){
        res2.setNominalResistance(0.0);
    }
    else if(r2 > 1000000){
        res2.setNominalResistance(1000000.0);
    }
    else{
        res2.setNominalResistance(r2);
    }
    cout << "Enter new tolerance for Resistor 2. Choose E12/E24/E48/E96 : ";
    cin >> t2;
    if(t2 == "E12"){
        res2.setTolerance(0.1);
    }
    else if(t2 == "E24"){
        res2.setTolerance(0.05);
    }
    else if(t2 == "E48"){
        res2.setTolerance(0.02);
    }
    else if(t2 == "E96"){
        res2.setTolerance(0.01);
    }
    else{
        res2.setTolerance(0.0);
    }
    cout << "New Values : " << endl;
    res1.display();
    res2.display();

}