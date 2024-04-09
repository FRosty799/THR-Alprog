import java.util.Scanner;
public class simplecslc {
    public static void main(String[] args) {
        double num1, num2, out;
        char operator;
        Scanner sc = new Scanner(System.in);
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            operator = sc.next().charAt(0);
        sc.close();
        switch (operator) {
            case '+':
                out = num1+num2;
                break;
            case '-':
                out = num1-num2;
                break;
            case '*':
                out = num1*num2;
                break;
            case '/':
                out =num1/num2;
                break;
            default:
                System.out.println("Invalid Operations");
                return; }
        System.out.println("Hasil: "+out);
    }
}
