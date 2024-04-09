import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input bilangan = ");
        int x = sc.nextInt();
        if (x%2==0) {
            System.out.println("bilangan "+x+" adalah genap");
        } else {
            System.out.println("bilangan "+x+" adalah ganjil");
        }
        sc.close();
    }
}
