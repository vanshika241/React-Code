import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc.nextInt();
        System.out.println("Enter the column");
        int col = sc.nextInt();
        int mat[][] = new int[row][col];
        System.out.println("Enter matrix elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Print the matrix ");
        for(int i=0;i<row;i++){
            System.out.print("[");
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
