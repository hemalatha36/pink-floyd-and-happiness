#include<stdio.h>
 
int main ()
{
    long int n;
    scanf("%ld",&n);
    int j = 0;
    register long int top = -1;
    long int arr[n];
    for(register long int i = 1; i <= n; i++)
    {
        
        long int k;
        scanf("%ld",&k);
        if( k == j + 1)
            j++;
        else if (top != -1 && arr[top] == j + 1 )
        {
            while(top != -1 && arr[top] == j + 1 )
           {
                j++;
                top--;
            }
            if(top == -1)
                arr[++top] = k;
            else
            if(arr[top]>k)
                arr[++top] = k;
        }
        else
        {
            if(top == -1)
                arr[++top] = k;
            else
            if(arr[top]>k)
                arr[++top] = k;
            else 
                {
                    printf("Sad");
                    return 0;
                }
        }
    }
    printf("Happy");
}