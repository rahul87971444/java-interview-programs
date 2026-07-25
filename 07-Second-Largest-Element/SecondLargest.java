import java.util.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {10,20,30,15,25};
        Arrays.sort(arr);

        System.out.println(arr[arr.length-2]);

    }

}
