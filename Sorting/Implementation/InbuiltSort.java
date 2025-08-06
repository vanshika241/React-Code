import java.util.*;

public class InbuiltSort {
    public static void main(String[] args) {
        // ===== 1D ARRAY SORTING =====
        int[] arr1D = {5, 2, 9, 1, 3};

        // Ascending
        int[] ascArr = arr1D.clone();
        Arrays.sort(ascArr);
        System.out.println("1D Ascending: " + Arrays.toString(ascArr));

        // Sort by index range [1 to 4)
        int[] indexArr = arr1D.clone();
        Arrays.sort(indexArr, 1, 4);
        System.out.println("1D Sorted (index 1 to 4): " + Arrays.toString(indexArr));

        // Descending
        Integer[] descArr = Arrays.stream(arr1D).boxed().toArray(Integer[]::new);
        Arrays.sort(descArr, Collections.reverseOrder());
        System.out.println("1D Descending: " + Arrays.toString(descArr));


        // ===== 2D ARRAY SORTING =====
        int[][] arr2D = {
            {5, 2},
            {1, 7},
            {4, 3}
        };

        // Sort by first column (index 0)
        Arrays.sort(arr2D, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println("2D Sorted by 1st Column Ascending:");
        for (int[] row : arr2D) {
            System.out.println(Arrays.toString(row));
        }


        // ===== LIST SORTING =====
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 30, 20, 5));

        // Ascending
        List<Integer> ascList = new ArrayList<>(list);
        Collections.sort(ascList);
        System.out.println("List Ascending: " + ascList);

        // Descending
        List<Integer> descList = new ArrayList<>(list);
        Collections.sort(descList, Collections.reverseOrder());
        System.out.println("List Descending: " + descList);
    }
}
