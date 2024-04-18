import java.util.Arrays;
import java.util.Random;

public class MergeSorting {

    public static void main(String[] args) {
        final int n = 300000;
        final int upperbound = 1000000000;
        int[] a = new int[n];
        Random rand = new Random(upperbound);

        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(upperbound);
        }
        sort(a);
        System.out.println(Arrays.toString(a));

    }

    public static void merge(int[] a , int l, int mid, int r){

        int lenL = mid-l+1;
        int lenR = r-mid;
        int[] left = new int[lenL];
        int[] right = new int[lenR];

        for (int i = 0; i < lenL; i++) {
            left[i] = a[i+l];
        }

        for (int i = 0; i < lenR; i++) {
            right[i] = a[i+mid+1];
        }

        int posL = 0, posR = 0;
        for (int pos = l; pos <= r; pos++) {
            if (posL == lenL){
                a[pos] = right[posR++];
            } else if (posR == lenR) {
                a[pos] = left[posL++];
            } else if (left[posL] <= right[posR]) {
                a[pos] = left[posL++];
            }else {
                a[pos] = right[posR++];
            }
        }
    }


    public static void mergeSort(int[] a, int l, int r){
        if (l<r){
            int mid = (l+r)/2;
            mergeSort(a,l, mid);
            mergeSort(a, mid+1,r);
            merge(a, l,mid, r);
        }
    }


    static void sort(int[] a){
        mergeSort(a,0,a.length-1);
    }

}
