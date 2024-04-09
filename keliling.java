import java.util.Scanner;
public class keliling {
    public static void main(String[] args) {
        System.out.println("input radius keliling");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double keliling = 2*Math.PI*r;
        System.out.println("keliling lingkaran = "+keliling);
        sc.close();
    }
}
