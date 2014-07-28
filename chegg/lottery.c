#include <stdio.h>
#include <stdbool.h>


bool Prize(int [],int []);
int main( )
{

int winningNumbers[6] = {20,4,5,1,33,27};

int picks[6];
int input;


printf("Winning Numbers are ");
for(int i = 0; i < 6; i++)
{
printf("%d ",winningNumbers[i]);
}


printf("\nEnter 6 numbers form 1 to 42 \n ");
int index = 0;
while(index < 6)
{
scanf("%d",&input);
if(input > 48 || input <= 0)
{
printf("\n numbers between 1 to 48 only ");
}
else
{
picks[index] = input;
index++;
}
}
printf("Your picks : ");
for(int i = 0; i < 6; i++)
printf("%d ",picks[i]);

bool res = Prize(winningNumbers,picks);

if(res == 0)
printf("\n Sorry You lost");
else if(res == 1)
printf("\n You win the lottery!");

return 0;
}

// this function return 1 if array matchs or 0 if not

bool Prize(int Win[] ,int Picks[])
{
bool result = false;
int i,j;
for(i = 0; i < 6; i++)
{
for(j = 0; j < 6; j++)
{
if(Picks[j] == Win[i])
{
result = true;
break;
}
else
result = false;
}
if(!result)
break;
}
  
return result;
}