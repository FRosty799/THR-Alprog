#include<stdio.h>
int main(int argc, char const *argv[])
{
    int i, n, sum, tmp;
    n = 50;
    sum = 0;
    while (i <= 50)
    {
        tmp = i%2;
        if (tmp==0)
        {
            printf("%d\n", i);
            sum +=1;
        }
        i++;
    }
    printf("jumlah bilangan ganjil dari 0 samapi 50 = %d\n", sum);
    return 0;
}
