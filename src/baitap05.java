import java.util.Scanner;

public class baitap05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng 1");
        int N = Integer.parseInt(scanner.nextLine());
        int[] array = new int[N];
        System.out.println("nhập các phần tử của mảng 1:");
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println("\nPhan tu nho nhat cua mang la:" + min);

    }
}
