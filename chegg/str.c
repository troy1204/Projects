/* Program to count no of words from given input string. */
#include <stdio.h>
#define OUT 0
#define IN  1
 
// returns number of words in str
unsigned countWords(char *str)
{
    int state = OUT;
    unsigned wc = 0;  // word count
 
    // Scan all characters one by one
    while (*str)
    {
        // If next character is a separator, set the state as OUT
        if (*str == ' ' || *str == '.')
            state = OUT;
        // If next character is not a word separator and state is OUT,
        // then set the state as IN and increment word count
        else if (state == OUT)
        {
            state = IN;
            ++wc;
        }
        // Move to next character
        ++str;
    }
 
    return wc;
}

void largestWord(char *str){
    char word[20], max[20], min[20], c;
    int i = 0, j = 0, flag = 0;
    for (i = 0; i < strlen(str); i++)
    {
        while (i < strlen(str) && !isspace(str[i]) && isalnum(str[i]))
        {
            word[j++] = str[i++];
        }
        if (j != 0)
        {
            word[j] = ' ';
            if (!flag)
            {
                flag = !flag;
                strcpy(max, word);
                strcpy(min, word);
            }
            if (strlen(word) > strlen(max))
            {
                strcpy(max, word);
            }
            j = 0;
        }
    }
    printf("The largest word is : '%s'\n", max);
    printf("Length of largest word is : '%i'\n", strlen(max));
}
// Driver program to tes above functions
int main(void)
{
    char str[100];
    printf("Please enter a string: \n");
    fgets(str, 100, stdin);
    
    int i;
    printf("No of words: %u\n", countWords(str));
    largestWord(str);

    //To toggle case
    for(i=0;str[i]!=NULL;i++)
    {
        if(str[i]>='A'&&str[i]<='Z')
            str[i]+=32;
        else if(str[i]>='a'&&str[i]<='z')
            str[i]-=32;
    }
 
    printf("String in toggle case is: %s\n\n",str);

    return 0;
}