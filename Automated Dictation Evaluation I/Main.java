#include<stdio.h>
#include<string.h>
int main()
{
    char str1[100];char str2[100];
    int i=0; 
    
    scanf("%s",str1);
 
    scanf("%s",str2);
    i=strcmp(str1,str2);    
    if(i==0)
    printf("It is correct");
    else
    printf("It is wrong");
    //printf("\nThe number of letters in the name is %d",l);
    return 0;
}