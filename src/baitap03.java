import java.util.Scanner;
import java.util.Arrays;

public class baitap03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng 1");
        int N = Integer.parseInt(scanner.nextLine());
        int[] array = new int[N];
        System.out.println("nhập các phần tử của mảng 1:");
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("nhập độ dài của mảng 2 ");
        int X = Integer.parseInt(scanner.nextLine());
        int[] Array = new int[X];
        System.out.println("nhập các phần tử của mảng 2:");
        for (int i = 0; i < X; i++) {
            Array[i] = Integer.parseInt(scanner.nextLine());
        }

        int[] dst = new int[array.length + Array.length];

        System.arraycopy(array, 0, dst, 0, array.length);
        System.arraycopy(Array, 0, dst, array.length, Array.length);

        System.out.println(Arrays.toString(dst));
    }
}
