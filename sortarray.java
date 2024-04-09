public class sortarray {
    public static void main(String[] args) {
        int arr[]={70,65,50,40,35,45,70,80,90};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int tmp=0;
                if (arr[i]<arr[j]) {
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
