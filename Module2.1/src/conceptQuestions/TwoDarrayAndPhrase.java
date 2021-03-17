package conceptQuestions;

import java.util.Scanner;

public class TwoDarrayAndPhrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
         char[][] matrix = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.next().charAt(i);
            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }

    }


//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (matrix[i][j] == 's') {
//                    if (matrix[i][j + 1] == 'a' && matrix[i][j + 2] == 'b' && matrix[i][j + 3] == 'a' && j + 3 < n) {
//                        count++;
//
//                    }
//
//                    if (matrix[i + 1][j] == 'a' && matrix[i + 2][j] == 'b' && matrix[i + 3][j] == 'a' && i + 3 < m) {
//                        count++;
//
//                    }
//                    if (matrix[i + 1][j + 1] == 'a' && matrix[i + 2][j + 2] == 'b' && matrix[i + 3][j + 3] == 'a' && i + 3 < m && j + 3 < n){
//                        count++;
//
//                    }
//
//                    if (matrix[i - 1][j + 1] == 'a' && matrix[i - 2][j + 2] == 'b' && matrix[i - 3][j + 3] == 'a' &&  i-3>0 && j + 3 < n){
//                        count++;
//
//                    }
//
//
//                }
//            }
//        }
//        System.out.println(count);
//

}
