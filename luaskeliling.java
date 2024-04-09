import java.util.Scanner;

public class luaskeliling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input radius");
        int r = sc.nextInt();
        double luas = Math.PI*Math.pow(r, 2);
        System.out.println("luas keliling = "+luas);
        sc.close();
    }
}
