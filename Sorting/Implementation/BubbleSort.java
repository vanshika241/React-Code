import java.util.*;

public class BubbleSort{
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean check = false;
            for(int j=1;j<n-i;j++){
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    check = true;
                }
            }
            if (check == false) {
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,4,2,1};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    
}
}
