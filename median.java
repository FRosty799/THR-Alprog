public class median {
    public static void main(String[] args) {
        int arr[] = {35, 40, 45, 50, 65, 70, 75, 80, 90, 100};

        if (arr.length % 2 == 0) {
            double tmp = (double) (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
            System.out.println("Median = " + tmp);
        } else {
            System.out.println("Median = " + arr[arr.length / 2]);
        }
    }
}
