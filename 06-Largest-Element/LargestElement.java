import java.util.Arrays;

public class LargestElement {

    public static void main(String[] args) {

        int arr[] = {10,5,20,8,15};

        Arrays.sort(arr);

        System.out.println("Largest = " + arr[arr.length-1]);

    }

}
