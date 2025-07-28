import java.util.*;

public class Basics{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1D Array
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");


        //MultiDimensional Arrays - 2D Array
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of cols ");
        int col = sc.nextInt();
        System.out.println("Enter matrix elements ");
        int mat[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               mat[i][j] = sc.nextInt();
            }
        }

         for(int i=0;i<row;i++){
            System.out.print("[");
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }


        //ArrayList - 1D
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(0,99);
        list.remove(0);
        list.set(list.size()-1, 19);
        System.out.println(list.size());
        System.out.println(list.get(3));
        System.out.println(list);
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


        //2D ArrayList
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        for(int i=0;i<3;i++){
            list2.add(new ArrayList<Integer>());
        }
        System.out.println("Enter Elements ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list2.get(i).add(sc.nextInt());
            }
        }

        System.out.println("Print 2D List");
         for(int i=0;i<3;i++){
            System.out.print("[");
            for(int j=0;j<3;j++){
               System.out.print(list2.get(i).get(j) + " ");
            }
            System.out.print("]");
            System.out.println();
        }
         sc.close();



    }
}
