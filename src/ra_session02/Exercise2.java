package ra_session02;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        /*
        * Xây dựng một ứng dụng cho phép người
        * dùng nhập vào 1 số từ 0 => 9 và hiển thị
        *  cách đọc của số đó trên màn hình
        * VD: người dùng nhập vào 1 thì hiển thị “Số Một”
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào 1 số từ 0-9 : ");
        int number = Integer.parseInt(scanner.nextLine());
        switch (number){
            case 0:
                System.out.println("không");
                break;
            case 1:
                System.out.println("một");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bốn");
                break;
            case 5:
                System.out.println("năm");
                break;
            case 6:
                System.out.println("sáu");
                break;
            case 7:
                System.out.println("bảy");
                break;
            case 8:
                System.out.println("tám");
                break;
            case 9:
                System.out.println("chín");
                break;
            default:
                System.out.println("Chỉ nhập các số từ 0-9");

        }
    }
}
