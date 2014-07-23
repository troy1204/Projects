#include <iostream>
using namespace std;

template<typename T>
double GetAverage(T tArray[], int nElements)
{
   T tSum = T(); // tSum = 0
   for (int nIndex = 0; nIndex < nElements; ++nIndex)
   {
     tSum += tArray[nIndex];
   }
   // Whatever type of T is, convert to double
   return double(tSum)/nElements;
}

int main()
{
    int IntArray[5] = {100,200,400,500,10000};
    float FloatArray[3] = {1.55, 5.44,12.36};
    cout << "Average is :" << GetAverage(IntArray, 5) << endl ;
    cout << "Average is :" << GetAverage(FloatArray, 3) << endl ;
    return 0;
}

