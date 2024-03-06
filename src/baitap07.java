import java.util.Scanner;

public class baitap07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][]arr = {
                {1,2,3},
                {2,4,5},
                {5,8,7}
        };
        int sum1 = 0;
        int sum2 =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j){
                    sum1 +=arr[i][j];
                }
                if(i+j == arr.length - 1){
                    sum2+= arr[i][j];
                }
            }
            
        }
        System.out.println("tổng đơn vị đường chéo chính =" + sum1);
        System.out.println("tổng đơn vị đường chéo phụ là:" +sum2);
    }

}
