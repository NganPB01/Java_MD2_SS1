package ra_session02;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào 1 khoảng số tự nhiên : ");
        float[] numbers = new float[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Nhập phần tử thứ "+ i +" : ");
            numbers[i] = scanner.nextFloat();
        }
        float sumEven = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            }
        }
        System.out.println("Tổng các số chẵn là: " + sumEven);
    }
}
