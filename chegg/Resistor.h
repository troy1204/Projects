#include <string>
class Resistor {
    private: 
        double nominalValue;    //Stores the resistor nominal value
        std::string tolerance;       // Stores the resistor ohm tolerance as a decimal value
        double tol;
    public:
        Resistor();
        Resistor(double, std::string);
        void setNominalResistance(double);
        void setTolerance(double);
        double getNominalResisistance();
        double getTolerance();
        double minResistance();
        double maxResistance();
        void display();
};