from collections import Counter
import string
print "Enter filename"
filename = raw_input()
filedata = open(filename, 'r').read()
answer = [];
def getUniqueWords(allWords) :
    uniqueWords = [] 
    for j in allWords:
        eachLine = j.split();
        count = Counter(eachLine);
        for a, b in enumerate(count):
            count[b];
            if count[b] == 1:
                uniqueWords.append(b);
    return uniqueWords
answer = sorted(getUniqueWords(filedata.splitlines()));
print "Sorted non duplicate words : "
for k in answer:
    print k;