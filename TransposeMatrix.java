import java.util.*;
public class TransposeMatrix{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] a1 = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a1[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = i; j < m; j++){
                int temp = a1[i][j];
                a1[i][j] = a1[j][i];
                a1[j][i] = temp;
            }
        }
        for(int i = 0; i <n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(a1[i][j]+"\t");
            }
            System.out.println();
        }
    }
}