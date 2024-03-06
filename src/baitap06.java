import java.util.Scanner;

public class baitap06 {
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
        System.out.println("nhập vị trí cột muốn tính tổng");
          int x = Integer.parseInt(scanner.nextLine());
          int sum = 0;
        if (x <= matrix.length ){
            for (int i = 0; i < c; i++) {
                sum = sum + matrix[i][x];
            }
            System.out.println("tổng của cột " + x + "là " + sum);
        } else {
            System.out.println("cột không tồn tại, mời nhập lại");
        }

    }
}
