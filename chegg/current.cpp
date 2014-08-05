#include <iostream>
#include <iomanip>
#include <cmath>
#include <fstream>
using namespace std;

int main()
{
	cout <<"Welcome! Let us calculate power." << endl;
	cout << "Please enter 5 current values" << endl;

	int resistance[5] = {16, 27, 39, 56, 81};
	float current[5];
	float power[5] = {0};
	int c = 0;

	fstream textfile;
	textfile.open("current.txt",fstream::out);

	
	for (int j = 0; j < 5; j++)
	{
		cin >> current[j];
		power[j] = (resistance[j] * pow(current[j],2));
	}

	cout << "" << endl;
	cout << "       Here are the results:   " << endl;
	cout <<"Resistance" << "\t" <<"Current" << "\t" << "Power" << endl;
	cout <<"----------" << "\t" <<"-------" << "\t" <<"-----" << endl;

	textfile << "       Here are the results:   " << endl;
	textfile <<"Resistance" << "\t" <<"Current" << "\t" << "Power" << endl;
	textfile <<"----------" << "\t" <<"-------" << "\t" <<"-----" << endl;

	for (int i = 0; i < 5; ++i)
	{
		cout << "\t"
			<< resistance[i]
			<< "\t"
			<< current[i]
			<< "\t"
			<< power[i]
			<< endl;
		textfile << "\t"
			<< resistance[i]
			<< "\t"
			<< current[i]
			<< "\t"
			<< power[i]
			<< endl;
	}
	cout <<"----------" << "\t" <<"-------" << "\t" <<"-----" << endl;
	textfile <<"----------" << "\t" <<"-------" << "\t" <<"-----" << endl;

	cout << "TOTAL:"
		<< "\t"
		<< resistance[0]+resistance[1]+resistance[2]+resistance[3]+resistance[4]
		<< "\t"
		<< current[0]+current[1]+current[2]+current[3]+current[4]
		<< "\t"
		<< power[0]+power[1]+power[2]+power[3]+power[4] 
		<< endl;
	textfile << "TOTAL:"
		<< "\t"
		<< resistance[0]+resistance[1]+resistance[2]+resistance[3]+resistance[4]
		<< "\t"
		<< current[0]+current[1]+current[2]+current[3]+current[4]
		<< "\t"
		<< power[0]+power[1]+power[2]+power[3]+power[4] 
		<< endl;
	return 0;
}