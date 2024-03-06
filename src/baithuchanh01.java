import java.util.Scanner;

public class baithuchanh01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số hàng của ma trận");
        int r = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào số cột của ma trận");
        int c = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[r][c];

       do {
           System.out.println("=============Menu============");
           System.out.println("Nhập giá trị cho tất cả phần tử mảng ");
           System.out.println("In các phần tử của mảng dưới dạng ma trận");
           System.out.println("Tính tổng tất cả phần tử mảng ");
           System.out.println("In ra đường chéo chính");
           System.out.println("In ra đường chéo phụ (phải là ma trận vuông)");
           System.out.println("In ra đường viền");
           System.out.println("thoát");


           int choice = Integer.parseInt(scanner.nextLine());
           switch (choice){
               case 1:
                   for (int i = 0; i < matrix.length; i++) {
                       for (int j = 0; j < matrix[i].length; j++) {
                           System.out.printf("matrix[%d][%d] = ",i,j);
                           matrix[i][j] = Integer.parseInt(scanner.nextLine());
                       }
                   }
                   break;
               case 2:
                   for (int i = 0; i < matrix.length; i++) {
                       for (int j = 0; j < matrix[i].length; j++) {
                           System.out.printf(matrix[i][j] + " ");
                       }
                       System.out.println();
                   }
                   break;
               case 3:
                   int sum = 0;
                   for (int i = 0; i < matrix.length; i++) {
                       for (int j = 0; j < matrix[i].length; j++) {
                           sum += matrix[i][j];
                       }
                   }
                   System.out.println(sum);
                   break;
               case 4:
                   for (int i = 0; i < matrix.length; i++) {
                       for (int j = 0; j < matrix[i].length; j++) {
                          if (i==j){
                              System.out.printf("%-3d",matrix[i][j]);
                          } else {
                              System.out.printf("%-3s", "");
                          }
                       }
                       System.out.println();
                   }
                   break;
               case 5:
                  if(r == c){
                      for (int i = 0; i < matrix.length; i++) {
                          for (int j = 0; j < matrix[i].length; j++) {
                              if (i+j == matrix.length -1){
                                  System.out.printf("%-3d",matrix[i][j]);
                              } else {
                                  System.out.printf("%-3s", "");
                              }
                          }
                          System.out.println();
                      }
                  } else {
                      System.out.println("chéo phụ chỉ dành cho ma trận vuông");
                  }
               case 6:
                   for (int i = 0; i < matrix.length; i++) {
                       for (int j = 0; j < matrix[i].length; j++) {
                           if (i == 0 || j==0 || i== r-1 || j == c-1){
                               System.out.printf("%-3d",matrix[i][j]);
                           } else {
                               System.out.printf("%-3s", "");
                           }
                       }
                       System.out.println();
                   }
               case 7:
                   System.exit(0);
                   break;
           }
       } while (true);
    }
}
