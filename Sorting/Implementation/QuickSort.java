import java.util.Arrays;

public class QuickSort{

    public static void quickSort(int arr[], int low, int high){
       if (low<high) {
        int pivot = placePivot(arr,low,high);
        quickSort(arr, low, pivot-1);
        quickSort(arr, pivot+1, high);
       }
    }
    private static int placePivot(int[] arr, int low, int high) {
        int pivot = low;
        int i=low;
        int j = high;
        while (i<j) {
            while (i<=high && arr[i]<=arr[pivot] ) {
                i++;
            }
            while (j>=low && arr[j]>arr[pivot] ) {
                j--;
            }
            if (i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}