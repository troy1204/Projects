fname = raw_input('Enter a file name: ')
with open(fname) as f:
    content = [line.strip() for line in open(fname)]
print "Number of lines : " + str(len(content));
sum = 0
sum2 = 0
for item in content:
	sum += len(item.split());
	words = item.split(" "); 
	for w in words:
		sum2 += len(w);
print "Number of words : " + str(sum);
print "Number of characters : " + str(sum2);