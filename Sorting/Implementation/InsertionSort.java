import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int j = i+1;
            while (j>0) {
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }
                else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
         int arr[] = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
