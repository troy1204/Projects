#include <iostream>

using namespace std;
int weightSort(int arr[], string names[], int n);
int nameSort(int arr[], string names[], int n);
int getCount(int arr[], string names[], int n);
void print(int arr[], string names[], int n);

int main()
{
  string names[12] = {"Anne", "Bob", "Ralph", "Tim", "Barbara", "Jane", "Steve", "Tom", "Mike", "Shirley", "Pam", "Frank"};
  int wgt[12] = {30, 150, 305, 225, 135, 160, 80, 200, 165, 90, 100, 120};
  int n = 12;
  int lmt = 1100, wc=0, nc=0;
   
  for(int i=0; i<n; i++){
    cout << names[i] << "\t" << wgt[i] <<endl;
  }
  int asum=0; int count=0;
  cout << "-----------------\n";
  count = getCount(wgt, names, n);
  print(wgt, names, count);

  cout << "-----------------\n";
  cout << "Arranging Weights in descending order : " << endl;
  wc = weightSort(wgt, names, n);
  cout << "Arranging Names in descending order : " << endl;
  nc = nameSort(wgt, names, n); 
  if(wc > nc)
    cout << "Can accomodate more people in the elevator by sorting weight in descending order" << endl;
  else
    cout << "Can accomodate more people in the elevator by sorting names in ascending order" << endl;
  return 0;
}

int weightSort(int arr[], string names[], int n) {
  bool swapped = true;
  int j = 0; int tmp; string tmp2;
  int sum=0; int asum=0; int count=0;
  while (swapped) {
    swapped = false;
    j++;
    for (int i = 0; i < n - j; i++) {
      if (arr[i] < arr[i + 1]) {
        tmp = arr[i];
        tmp2 = names[i];
        arr[i] = arr[i + 1];
        names[i] = names[i + 1];
        arr[i + 1] = tmp;
        names[i + 1] = tmp2;
        swapped = true;
      }
    }
  }
  count = getCount(arr, names, n);
  print(arr, names, count);
  return count;
}

int nameSort(int wgt[], string names[], int n) {
  //pos_min is short for position of min
  int pos_min; string temp; int temp2=0;
  int sum=0; int asum=0; int count=0;
  for (int i=0; i < n-1; i++)
  {
    pos_min = i;//set pos_min to the current index of array
    for (int j=i+1; j < n; j++)
    {
      if (names[j] < names[pos_min])
        pos_min=j; //pos_min will keep track of the index that min is in, this is needed when a swap happens
    }
    //if pos_min no longer equals i than a smaller value must have been found, so a swap must occur
    if (pos_min != i)
    {
      temp = names[i];
      temp2 = wgt[i];
      names[i] = names[pos_min];
      wgt[i] = wgt[pos_min];
      names[pos_min] = temp;
      wgt[pos_min] = temp2;
    }
  }
  count = getCount(wgt, names, n);
  print(wgt, names, count);
  return count;
}

int getCount(int wgt[], string names[], int n) {
  int sum=0, c=0; 
  for(int j=0; j<12; j++){
    sum = sum + wgt[j];
    if(sum < 1100){
      c++;
    }
  }
  return c;
}

void print(int wgt[], string names[], int n){
  int sum=0;
  for(int i=0; i<n; i++){
    cout << names[i] << "\t" << wgt[i] <<endl;
    sum += wgt[i];
  }
  cout << "Total weight of " << n << " people : " << sum << endl;
}
