import java.util.Arrays;

public class QuickSort {


    public static void swap(int arr[],int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high){

        int pivot = arr[high];
        System.out.println(high);

        int a = (low-1);

        for (int i = low; i <= high-1; i++) {

            if(arr[i]<pivot){
                a++;
                swap(arr, a, i);
            }
        }
        swap(arr, a+1, high);
        return a+1;
    }


    public static void quickSort(int arr[], int low, int high){
        if (low<high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }


    public static void main(String[] args) {

        int arr[] = {5, 2,10,50,1, 24, 31, 13};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

}
