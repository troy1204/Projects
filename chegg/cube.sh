print ("Enter a number")
n = int(input());
sum = 0;
for i in range(0,n+1):
    sum = sum + (i**3);
print("Sum of cubes is : ", sum);