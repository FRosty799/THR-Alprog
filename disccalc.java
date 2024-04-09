import java.util.Scanner;
public class disccalc {
    public static void main(String[] args) {
        int totprice;
        double disc, tax, finalprice;
        Scanner sc = new Scanner(System.in);
        System.out.println("input total harga = ");
        totprice = sc.nextInt();
        System.out.println("input pajak dalam %");
        tax = sc.nextDouble();
        System.out.println("input discount dalam %");
        disc = sc.nextDouble();
        finalprice = (1-(disc/100))*totprice;
        finalprice += finalprice*(tax/100);
        System.out.println("harga final = "+finalprice);
        sc.close();
    }
}
