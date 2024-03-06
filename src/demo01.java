public class demo01 {
    public static void main(String[] args) {
//        khai báo mảng
        int[] number = new int[5];
        System.out.println(number.length);
        String[] nyc = {"hương", "ngọc", "trang", "giang", "uyên"};
        System.out.println("so phan tu cua mang nyc" + nyc.length);

//        truy cập vào phần tử mảng
        System.out.println("nguoi yeu cu thu 3" + nyc[2]);

//        dùng vòng lặp để duyệt qua mảng
//        for i
        System.out.println("danh sách người yêu cũ");
        for (int i = 0; i < nyc.length; i++) {
            System.out.println(nyc[i]);
        }
//            for each
        for (String item : nyc) {
            System.out.println(item);
        }

    }
}
