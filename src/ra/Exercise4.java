package ra;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào điểm Toán: ");
        float toan = scanner.nextFloat();
        System.out.println("Mời nhập vào điểm Văn: ");
        float van = scanner.nextFloat();
        System.out.println("Mời nhập vào điểm Anh: ");
        float anh = scanner.nextFloat();
        float tb = (toan + van + anh) / 3;
        System.out.println("Điểm trung bình 3 môn toán, văn, anh là: " + tb);
    }
}
