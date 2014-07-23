#include<stdio.h>
#include<string.h>
#include<ctype.h>
        int filter1(char email[]){
                char *ch=email;
                while(*ch!='\0'){
                if(*ch=='@')
                   return 1;
                ch++;
                } 
            return 0;
        }
        int filter2(char email[]){
                int len=strlen(email);
                if(email[0]=='@'||email[len-1]=='@')
                    return 0;
                return 1;      
        }
        int filter3(char email[]){
                int i;
                for( i=0;i<strlen(email);i++){
                    if(email[i]!='@')continue;
                        while(i<strlen(email)){
                        if(email[i++]=='.')
                        return 1;
                        }
                }
                return 0;
        }
        int filter4(char email[]){
                int i;
                for( i=0;i<strlen(email);i++){
                    if(email[i]!='@')continue;
                        if(email[i-1]=='.'||email[i+1]=='.')
                                return 0;      
                }
                return 1;
        }
        int filter5(char email[]){
                int i;
                for( i=0;i<strlen(email);i++){
                   if(isalnum(email[i]) || email[i]=='.'||email[i]=='@'||email[i]=='_'||email[i]=='-')continue;
           else 
                   return 0;              
                }
                return 1;
        }
        int filter6(char email[]){
                if(email[0]=='.'||email[strlen(email)-1]=='.')
                        return 0;      
                return 1;
        }
        int filter7(char email[]){
                int i;
                for(i=0;i<strlen(email);i++){
                 if(email[i]!='.')continue;
                 if(email[i+1]=='.')return 0;
                }
                return 1;
        }
        int validEmail(char email[]){
                        int Valid=0;
                        //checking filter 1
                        printf("FILTER 1:");
                        if(filter1(email)){
                        printf("OK");Valid=1;
                        }else{
                                printf("FAILED");Valid=0;
                        }
                        printf("\n");
                        //checking filter 2
                        printf("FILTER 2:");
                        if(filter2(email)){
                        printf("OK");Valid=1;
                        }else{
                                printf("FAILED");Valid=0;
                        }
                        printf("\n");
                        //checking filter 3
                        printf("FILTER 3:");
                        if(filter3(email)){
                        printf("OK");Valid=1;
                        }else{
                                printf("FAILED");Valid=0;
                        }
                        printf("\n");
                        //checking filter 4
                        printf("FILTER 4:");
                        if(filter4(email)){
                        printf("OK");Valid=1;
                        }else{
                                printf("FAILED");Valid=0;
                        }
                        printf("\n");
                        //checking filter 5
                        printf("FILTER 5:");
                        if(filter5(email)){
                        printf("OK");Valid=1;
                        }else{
                                printf("FAILED");Valid=0;
                        }
                        printf("\n");
                        //checking filter 6
                        printf("FILTER 6:");
                        if(filter6(email)){
                        printf("OK");Valid=1;
                        }else{
                                printf("FAILED");Valid=0;
                        }
                        printf("\n");
                        //checking filter 7
                        printf("FILTER 7:");
                        if(filter7(email)){
                        printf("OK");Valid=1;
                        }else{
                                printf("FAILED");Valid=0;
                        }
                        printf("\n");
                return Valid;
        }
int main(){
        char email[50];
        printf("Enter An Email Address\n");
        scanf("%s",email);
        if(validEmail(email))
                printf("Valid Email Address\n");
        else
                printf("Invalid Email Address\n");
        system("pause");
        return 0;              
}
