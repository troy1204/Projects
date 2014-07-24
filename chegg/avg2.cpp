#include <iostream>
using namespace std;
int main()
{
    int num; int n; bool run=true;
    while(run){
        int arr[100];
        int sum=0; int avg=0; int max; int min;
        cout << "How many numbers (<= 0 to quit)?"; 
        cin >> num;
        if(num>0){
            for(int i=0; i<num; i++){
                cout << "Enter the number :";
                cin >> n;
                arr[i] = n;
            }
            min = arr[0], max=arr[0];
            for (int i = 0; i < num; i++)
            {
                sum += arr[i];
                if(max < arr[i]){
                    max = arr[i];
                }
                if(min > arr[i]){
                    min = arr[i];
                }
            }
            avg = sum/num;
            cout << "The sum is : " << sum << endl;
            cout << "The average is : " << avg << endl;
            cout << "The minimum is : " << min << endl;
            cout << "The maximum is : " << max << endl;
        }
        else{
            run = false;
            cout << "Thanks for playing!" << endl;
        }
    }
   return 0;
}
