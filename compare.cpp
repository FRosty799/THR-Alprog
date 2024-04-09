#include <stdio.h>

int main(int argc, char const *argv[])
{
    int n,m;
    printf("input bilangan pertama = ");
    scanf("%i",&n);
    printf("input bilangan kedua = ");
    scanf("%i",&m);
    if (n>m){
        printf("bilangan terbesar adalah %i\n",n);
    } else{
        printf("bilangan terbesar adalah %i\n",m);
    }
    return 0;
}
