import collections
f = open("data.txt", 'r');
lines = f.readlines();
numbers =[int(e.strip()) for e in lines];
#print numbers;
print "Sum = " + str(sum(numbers));
print "Highest Number = " + str(max(numbers));
print "Lowest numner = " + str(min(numbers));
print "Average = " + str(sum(numbers)/len(numbers));
counter = collections.Counter(numbers);
print "Highest frequency number " + str(counter.most_common(1)[0][0]) + " appears " + str(counter.most_common(1)[0][1]) + "times.";