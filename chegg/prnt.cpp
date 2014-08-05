#include <iostream>
using namespace std;
void prnt(int n);
int main() {
    int num;
    cout << "Enter a non negative integer number : ";
    cin >> num;
    prnt(num);
    cout << endl;
    return 0;
}
void prnt(int n) {
    if(n > 0){
        cout << "*";
        n--;
        prnt(n);
        cout << "$";
    }
}