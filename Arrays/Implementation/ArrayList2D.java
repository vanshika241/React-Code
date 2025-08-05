import java.util.*;
public class ArrayList2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list  = new ArrayList<>();
        System.out.println("Enter size");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println("Print 2D ArrayList");
          for(int i=0;i<n;i++){
            System.out.print("[");
            for(int j=0;j<n;j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
