import java.util.Scanner;

public class tempconv {
    public static void main(String[] args) {
        double f,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("conversi temperatur \n" + "1.celsius -> farenheit" + "farenhet -> cessius\n");
            int ch= sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("input tempetratur farenheit = ");
                f=sc.nextDouble();
                c=(f-32)*5/9;
                System.out.println("temperatur dalam celsius = " + c);
                break;

            case 2:
                System.out.println("input tempetratur celsuius = ");
                c=sc.nextDouble();
                f=((9*c)+32);
                System.out.println("temperatur dalam farenheit = " + f);

                break;
        
            default:
                System.out.println("input invalid");
                break;
        }
        sc.close();
    }
}
