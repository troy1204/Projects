#!/usr/local/bin/python2.7
import random  
from datetime import datetime
myList= random.sample(xrange(50000), 50000);
myList2= random.sample(xrange(100000), 100000);
myList3= random.sample(xrange(150000), 150000);
myList4= random.sample(xrange(200000), 200000);
myList5= random.sample(xrange(250000), 250000);
myList6= random.sample(xrange(300000), 300000);

##myList= random.sample(xrange(50), 50);
##myList2= random.sample(xrange(100), 100);
##myList3= random.sample(xrange(150), 150);
##myList4= random.sample(xrange(200), 200);
##myList5= random.sample(xrange(250), 250);
##myList6= random.sample(xrange(300), 300);

def swap( A, x, y ):
  tmp = A[x]
  A[x] = A[y]
  A[y] = tmp
  
#1. Begin SELECTION SORT#
def selectionsort( aList ):
  ##print "SELECTION SORT";
  for i in range( len( aList ) ):
    least = i
    for k in range( i + 1 , len( aList ) ):
      if aList[k] < aList[least]:
        least = k
    swap(aList,least,i )
  ##print(aList);
#End SELECTION SORT#    
##selectionsort(myList);

#2. Begin BUBBLE SORT#
def bubblesort(aList):
  ##print "BUBBLE SORT";
  end=len(aList)-1
  while (end!=-1):
    swapped=-1
    for i in range(0,end):
        if aList[i]>aList[i+1]:
            temp=aList[i]
            aList[i]=aList[i+1]
            aList[i+1]=temp
            swapped=i
    end=swapped
  ##print(aList);
#End BUBBLE SORT#
#bubblesort(myList)

#3. Begin MERGE SORT#
def mergesort(aList):
  ##print "MERGE SORT";
  _mergesort(aList, 0, len(aList) - 1 );
  ##print(aList);

def _mergesort( aList, first, last ):
  # break problem into smaller structurally identical pieces
  mid = ( first + last ) / 2
  if first < last:
    _mergesort( aList, first, mid )
    _mergesort( aList, mid + 1, last )
 
  # merge solved pieces to get solution to original problem
  a, f, l = 0, first, mid + 1
  tmp = [None] * ( last - first + 1 )
 
  while f <= mid and l <= last:
    if aList[f] < aList[l] :
      tmp[a] = aList[f]
      f += 1
    else:
      tmp[a] = aList[l]
      l += 1
    a += 1
 
  if f <= mid :
    tmp[a:] = aList[f:mid + 1]
 
  if l <= last:
    tmp[a:] = aList[l:last + 1]
 
  a = 0
  while first <= last:
    aList[first] = tmp[a]
    first += 1
    a += 1
#End MERGE SORT#

##mergesort(myList);

#4. Begin QUICK SORT#
def quicksort(myLst, start, end):
    if start < end:
        # partition the list
        pivot = partition(myLst, start, end)
        # sort both halves
        quicksort(myLst, start, pivot-1)
        quicksort(myLst, pivot+1, end)
    return myLst

def partition(myLst, start, end):
    pivot = myLst[start]
    left = start+1
    right = end
    done = False
    while not done:
        while left <= right and myLst[left] <= pivot:
            left = left + 1
        while myLst[right] >= pivot and right >=left:
            right = right -1
        if right < left:
            done= True
        else:
            # swap places
            temp=myLst[left]
            myLst[left]=myLst[right]
            myLst[right]=temp
    # swap start with myList[right]
    temp=myLst[start]
    myLst[start]=myLst[right]
    myLst[right]=temp
    return right
#End QUICK SORT#

##print "QUICK SORT";
##print quicksort(myList,0,len(myList)-1);

#5. Begin HEAP SORT#
def heapsort( aList ):
  ##print "HEAP SORT";
  # convert aList to heap
  length = len( aList ) - 1
  leastParent = length / 2
  for i in range ( leastParent, -1, -1 ):
    moveDown( aList, i, length )
 
  # flatten heap into sorted array
  for i in range ( length, 0, -1 ):
    if aList[0] > aList[i]:
      swap( aList, 0, i )
      moveDown( aList, 0, i - 1 )
  ##print aList;
 
def moveDown( aList, first, last ):
  largest = 2 * first + 1
  while largest <= last:
    # right child exists and is larger than left child
    if ( largest < last ) and ( aList[largest] < aList[largest + 1] ):
      largest += 1
 
    # right child is larger than parent
    if aList[largest] > aList[first]:
      swap( aList, largest, first )
      # move down to largest child
      first = largest;
      largest = 2 * first + 1
    else:
      return # force exit
#End HEAP SORT#
#heapsort(myList);    

#6. Begin RADIX SORT#
def radixsort(aList):
  ##print "RADIX SORT";
  RADIX = 10
  maxLength = False
  tmp , placement = -1, 1
  while not maxLength:
    maxLength = True
    # declare and initialize buckets
    buckets = [list() for _ in range( RADIX )]
 
    # split aList between lists
    for  i in aList:
      tmp = i / placement
      buckets[tmp % RADIX].append( i )
      if maxLength and tmp > 0:
        maxLength = False
 
    # empty lists into aList array
    a = 0
    for b in range( RADIX ):
      buck = buckets[b]
      for i in buck:
        aList[a] = i
        a += 1
 
    # move to next digit
    placement *= RADIX
  ##print aList;
#End RADIX SORT#
#radixsort(myList);

t0 = datetime.now()
selectionsort(myList);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Selection Sort on " + str(len(myList)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
selectionsort(myList2);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Selection Sort on " + str(len(myList2)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
selectionsort(myList3);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Selection Sort on " + str(len(myList3)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
selectionsort(myList4);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Selection Sort on " + str(len(myList4)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
selectionsort(myList5);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Selection Sort on " + str(len(myList5)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
selectionsort(myList6);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Selection Sort on " + str(len(myList6)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
print "---------------------------------------------------------------";

t0 = datetime.now()
bubblesort(myList);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Bubble Sort on " + str(len(myList)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
bubblesort(myList2);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Bubble Sort on " + str(len(myList2)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
bubblesort(myList3);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Bubble Sort on " + str(len(myList3)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
bubblesort(myList4);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Bubble Sort on " + str(len(myList4)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
bubblesort(myList5);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Bubble Sort on " + str(len(myList5)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
bubblesort(myList6);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Bubble Sort on " + str(len(myList6)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
print "---------------------------------------------------------------";

t0 = datetime.now()
mergesort(myList);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Merge Sort on " + str(len(myList)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
mergesort(myList2);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Merge Sort on " + str(len(myList2)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
mergesort(myList3);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Merge Sort on " + str(len(myList3)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
mergesort(myList4);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Merge Sort on " + str(len(myList4)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
mergesort(myList5);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Merge Sort on " + str(len(myList5)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
mergesort(myList6);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Merge Sort on " + str(len(myList6)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
print "---------------------------------------------------------------";

t0 = datetime.now()
quicksort(myList,0,len(myList)-1);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Quick Sort on " + str(len(myList)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
quicksort(myList2,0,len(myList2)-1);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Quick Sort on " + str(len(myList2)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
quicksort(myList3,0,len(myList3)-1);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Quick Sort on " + str(len(myList3)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
quicksort(myList4,0,len(myList4)-1);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Quick Sort on " + str(len(myList4)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
quicksort(myList5,0,len(myList5)-1);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Quick Sort on " + str(len(myList5)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
quicksort(myList6,0,len(myList6)-1);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Quick Sort on " + str(len(myList6)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
print "---------------------------------------------------------------";

t0 = datetime.now()
heapsort(myList);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Heap Sort on " + str(len(myList)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
heapsort(myList2);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Heap Sort on " + str(len(myList2)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
heapsort(myList3);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Heap Sort on " + str(len(myList3)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
heapsort(myList4);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Heap Sort on " + str(len(myList4)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
heapsort(myList5);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Heap Sort on " + str(len(myList5)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
heapsort(myList6);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Heap Sort on " + str(len(myList6)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
print "---------------------------------------------------------------";

t0 = datetime.now()
radixsort(myList);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Radix Sort on " + str(len(myList)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
radixsort(myList2);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Radix Sort on " + str(len(myList2)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
radixsort(myList3);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Radix Sort on " + str(len(myList3)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
radixsort(myList4);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Radix Sort on " + str(len(myList4)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
radixsort(myList5);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Radix Sort on " + str(len(myList5)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
t0 = datetime.now()
radixsort(myList6);
t1 = datetime.now()
rt = t1-t0;
print "Time to run Radix Sort on " + str(len(myList6)) + " numbers is " + str(rt.microseconds/1000) + " milliseconds";
print "---------------------------------------------------------------";
  
