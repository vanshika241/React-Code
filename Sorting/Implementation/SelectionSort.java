import java.util.Arrays;

public class SelectionSort {

    public static int getMax(int arr[], int start, int end){
        int maxi = 0;
        for(int i=1;i<=end;i++){
            if (arr[i]>arr[maxi]) {
                maxi = i;
            }
        }
        return maxi;
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int lastIdx = n-1-i;
            int maxi = getMax(arr, 0, lastIdx);
            if (arr[maxi] != arr[lastIdx]) {
                int temp = arr[maxi];
                arr[maxi] = arr[lastIdx];
                arr[lastIdx] = temp;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {3,5,4,2,1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
