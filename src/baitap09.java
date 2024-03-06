public class baitap09 {
    public static void main(String[] args) {
        int[] arr = {23,56,76,4,7,9,8,13,23,45,67};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest <arr[i]){
                secondLargest = largest;
                largest = arr[i];
            } else if (secondLargest < arr[i] && arr[i] < largest]) {
                secondLargest = arr[i];
            }
        }
        System.out.println("giá trị lớn nhất là" +largest);
        System.out.println("giá trị lớn thứ hai là" + secondLargest);
    }
}
