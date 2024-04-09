#include<stdio.h>

int main(int argc, char const *argv[])
{
    int i, sum=0;
    while (true)
    {
        printf("input bilangan (input bilangan negatif untuk berhenti) = \n");
        scanf("%d", &i);
        if (i<0)
        {
            break;
        }
        if (i%2==0)
        {
            sum += i;
        }
    }
    printf("jumlah total bilangan genap diinput = %d\n", sum);
    
    return 0;
}
