import collections
f = raw_input("Enter string : ");
def ispangram(testVar):
	print testVar;
	from collections import Counter
	testVar = testVar.lower().strip().replace(" ","");
	counter = collections.Counter(testVar);
	if len(counter) == 26:
		print "String is panagram";
	else:
		print "String is not panagram";
ispangram(f);