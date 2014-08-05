print ("Enter how many number you want to add?")
n = int(input());
sum = 0;
for i in range(0,n):
    print ("Enter number :")
    num = int(input());
    sum = sum + num;
print("Sum is ", sum);