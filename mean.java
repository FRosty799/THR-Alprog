public class mean {
    public static void main(String[] args) {
        int arr[]={70,65,50,40,35,45,70,80,90};
        int mean, tot = 0, tmp;
        for (int i = 0; i < arr.length; i++) {
            tmp = arr[i];
            tot += tmp;
        }
        mean = tot/arr.length;
        System.out.println("rata-rata = "+mean);
    }
}
