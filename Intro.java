import java.util.*;
public class Intro{
    public static void main(String[] args){
        int[][] Arr1 = new int[3][3];
        int[][] Arr2 = new int[3][3];
        int[][] multi = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i==j){
                    Arr1[i][j] = 1;
                    Arr2[i][j] = 1;
                }
                else{
                    Arr1[i][j] = 2;
                    Arr2[i][j] = 2;
                }
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    multi[i][j] += Arr1[i][k]*Arr2[k][j];
                }
            }
            // System.out.println();
        }
        for (int i = 0; i < 3; i++){
            for(int j= 0; j < 3; j++){
                System.out.print(multi[i][j]+"\t");
            }
            System.out.println();
        }
    }
}