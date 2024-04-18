import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch{


    public static void main(String[] args) {

        int[] arr = {1,2,40 ,6,50,15,12,11,19,27,20};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 12));

    }

    public static int binarySearch(int arr[], int a) {


        int l = 0, r = arr.length - 1;

        while (l <= r) {

            int m = l + (r - l) / 2;

            if (arr[m] == a) {
                return m;
            }
            if (a > arr[m]) {

                l = m + 1;

            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}
