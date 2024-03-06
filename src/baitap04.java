import java.util.Scanner;

public class baitap04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số hàng của ma trận");
        int r = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào số cột của ma trận");
        int c = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[r][c];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("matrix[%d][%d] = ",i,j);
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int max = matrix[0][0];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận = " + max);

    }
}
