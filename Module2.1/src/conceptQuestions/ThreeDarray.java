package conceptQuestions;

import java.util.Scanner;

public class ThreeDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][][] matrix = new int[l][m][n];
        for(int k=0; k<l; k++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    matrix[k][i][j] = sc.nextInt();
                }
            }
        }

        for(int k=0; k<l; k++){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[k][i][j] +" ");

    }
            System.out.println(" ");
        }
            System.out.println(" ");
        }



    }
}
