import string
print "Enter filename"
filename = raw_input()
filedata = open(filename, 'r').read()
print 'Lines:',len(filedata.splitlines()),' Words:', len(string.split(filedata)), " Chars:",len(filedata)