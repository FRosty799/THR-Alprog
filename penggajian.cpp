#include<stdio.h>

int main(int argc, char const *argv[])
{
    char nama[100], gol;
    int workhour, tmp, overtime, pay, otpay, finalpay;
    printf("masukan nama karyawan : ");
    scanf("%s", nama);
    printf("masukan jumlah jam kerja : ");
    scanf("%d", &workhour);
    printf("masukan golongan karyawan A/B/C/D: ");
    scanf(" %c", &gol);
    switch (gol)
    {
    case 'A' :
        tmp = 5000;
        break;
    
    case 'B' :
        tmp = 7000;
        break;

    case 'C' :
        tmp = 8000;
        break;

    case 'D' :
        tmp = 10000;
        break;

    default:
        printf("Invalid grade entered.");
        return 1;
    }
    if (workhour > 48) {
        overtime = workhour - 48;
        pay = 48 * tmp;
        otpay = overtime * 4000;
        finalpay = pay + otpay;
    } else {
        finalpay = workhour * tmp;
    }
    printf("Karyawan : %s\n", nama);
    printf("Gaji karyawan : %d\n", finalpay);

    return 0;
}
