/*1.

Write a complete program with comments and sample run
Ask the user for a number . Your program will read and compute the average for that many (numbers) integers, display the result. Your average has to be formatted to one decimal point. You have to use a for loop and have only one variable for reading the integers.
Example: Please enter how many numbers you have
8
Please enter 8 numbers to calculate the average
1 2 3 4 5 6 7 8
Your average is 18.0*/

#include <iostream>
using namespace std;
int main()
{
    int num = 0;
    int array[100];
    cout << "Please enter how many numbers you have" << endl;
    cin >> num;
    for(int i = 0; i < num; ++i){
        cin >> array[i];
    }
    int sum = 0;
    int average = 0;
    for (int i = 0; i < num; ++i)
        sum+=array[i];
    cout << "Sum is : " << sum;
    average = sum/num;
    cout<<"Average:"<<average;
}

