a=int(input('Enter first number : \n'));
b=int(input('Enter second number : \n'));
def gcd(a, b):
    if (0 == a % b):
        return b
    return gcd(b, a%b)
print ("GCD of ", a, " and ", b, " is : " ,gcd(a,b));
