#include<stdio.h>

int main(int argc, char const *argv[])
{
    int i;
    printf("Pilih menu anda:\n");
    printf("1. Nasi goreng harga Rp 11.000\n");
    printf("2. Nasi kuning harga Rp 8.000\n");
    printf("3. Nasi uduk harga Rp 7.500\n");
    printf("4. Nasi padang harga Rp 15.000\n");
    printf("Masukkan nomor menu yang dipilih: ");
    scanf("%d",&i);
    switch (i)
    {
    case 1:
        printf("Anda memilih Nasi goreng\n");
        printf("Harga Rp 11.000");
        break;
    case 2:
        printf("Anda memilih Nasi kuning\n");
        printf("Harga Rp 8.000");
        break;
    case 3:
        printf("Anda memilih Nasi uduk\n");
        printf("Harga Rp 7.500");
        break;
    case 4:
        printf("Anda memilih Nasi padang\n");
        printf("Harga Rp 15.000");
        break;
    default:
        printf("menu invalid");
        break;
    }
    
    return 0;
}
