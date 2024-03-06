import java.util.Scanner;

public class baitap01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào độ dài của mảng: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("nhập phần tử càn xóa: ");
        int X = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }
        if (index_del != -1) {
            for (int i = index_del; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, index_del);
            System.arraycopy(array, index_del + 1, newArray, index_del, array.length - index_del - 1);
            array = newArray;
        }
        System.out.println("mảng mới đã xóa:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}