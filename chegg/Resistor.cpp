#include <iostream>
#include <string>
#include <iomanip>
#include "Resistor.h"
using namespace std;
//Class Declaration
Resistor::Resistor(){
    nominalValue = 0.0;
    tol = 0.0;
}

void Resistor::setNominalResistance(double r){
    nominalValue = r;
}

void Resistor::setTolerance(double t){
    tol = t;
}

double Resistor::getNominalResisistance(){
    return nominalValue;
}

double Resistor::getTolerance(){
    return tol;
}

Resistor::Resistor(double r, std::string t){
    if(r < 0){
        nominalValue = 0;
    }
    else if(r > 1000000){
        nominalValue = 1000000;
    }
    else{
        nominalValue = r;
    }
    if(t == "E12"){
        setTolerance(0.1);
    }
    else if(t == "E24"){
        setTolerance(0.05);
    }
    else if(t == "E48"){
        setTolerance(0.02);
    }
    else if(t == "E96"){
        setTolerance(0.01);
    }
    else{
        setTolerance(0.0);
    }
}

double Resistor::minResistance(){
    return nominalValue * (1.0 - tol);
}

double Resistor::maxResistance(){
    return nominalValue * (1.0 + tol);
}

void Resistor::display(){
    cout << "Nominal Resistance is : " << getNominalResisistance() << endl;
    cout << "Tolerance is : " << getTolerance() * 100.00 << "%" <<endl;
    cout << "Minimum Resistance is : " << minResistance() << endl;
    cout << "Maximum Resistance is : " << maxResistance() << endl;
    cout << "-------------------------------" << endl;
}