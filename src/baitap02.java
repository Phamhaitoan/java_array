import java.util.Scanner;

public class baitap02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập độ dài của mảng: ");
        int N = Integer.parseInt(scanner.nextLine());
        int[] array = new int[N];
        System.out.println("nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Nhập phần tử cần chèn: ");
        int X = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chỉ mục để chèn phần tử: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index <= -1 || index >= array.length) {
            System.out.println("Cannot insert the element at the given index.");
        } else {
            int[] newArray = new int[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, index);
            newArray[index] = X;
            System.arraycopy(array, index, newArray, index + 1, array.length - index);
            array = newArray;
        }
        System.out.println("mảng mới:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}