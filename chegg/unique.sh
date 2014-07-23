import string
print "Enter filename"
filename = raw_input()
filedata = open(filename, 'r').read()
answer = [];
def getUniqueWords(allWords) :
    uniqueWords = [] 
    for j in allWords:
        eachLine = j.split();
        for i in eachLine:
            if not i in uniqueWords:
                uniqueWords.append(i)
    return uniqueWords
answer = sorted(getUniqueWords(filedata.splitlines()));
print "Sorted unique words : "
for k in answer:
    print k;
