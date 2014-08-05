#include <iostream>
#include <cstring>
using namespace std;
void convertCaption(char caption[]);
int main()
{
    string tmp;
    cout << "Enter string" << endl;
    cin >> tmp;
    char tab2[1024];
    strncpy(tab2, tmp.c_str(), sizeof(tab2));
    tab2[sizeof(tab2) - 1] = 0;
    convertCaption(tab2);
    return 0;
}
void convertCaption(char caption[]){   
    int i;
    int x = strlen(caption);
    for (i=0;i<x;i++){
        caption[i]= toupper(caption[i]);
    }
    for (i=0;i<x;i++){
        cout << caption[i];
    }
    cout << endl;
}
