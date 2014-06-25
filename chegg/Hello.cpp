// reading a text file
#include <iostream>
#include <fstream>
#include <string>
#include <stdexcept>
using namespace std;

int main () {
	string line;
  	string text;
  	std::ofstream myfile("example.txt", ios::app);
  	myfile.exceptions ( ifstream::eofbit | ifstream::failbit | ifstream::badbit );
  	cout << "Enter text to append at end of file : " ;
  	std::getline(cin, text);

  	try{
  		if(myfile.is_open())
  		{
  			myfile << text;
    		myfile.close();
  		}
  	}
  	catch(std::exception const& e){
  		cout << "Unable to open file";
  	} 

  	ifstream ifile ("example.txt");
  	try{
  		if(ifile.is_open())
  		{
    		while(getline(ifile,line))
    		{
      		cout << line << '\n';
    		}
    		ifile.close();
  		}
  	}
  	catch(std::exception const& e){
  		cout << "Unable to open file";
  	} 

  	return 0;
}