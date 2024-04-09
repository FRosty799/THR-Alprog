// Online C++ compiler to run C++ program online
#include <stdio.h>

int main() {
    // Write C++ code here
    char huruf;
    printf("program menentukan huruf vokal \n");
    printf("---||--- \n\n");
    printf("masukan huruf : ");
    scanf("%c",&huruf);
    if (huruf=='a'||huruf=='i'||huruf=='u'||huruf=='e'||huruf=='o')
        printf("huruf %c adalah huruf vokal\n",huruf);
    else
        printf("huruf %c adalah huruf konsonan\n",huruf);
}