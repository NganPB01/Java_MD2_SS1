package ra_session02;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        /*
        * Trong phần này, chúng ta sẽ phát triển một ứng dụng cho
        * phép người dùng nhập vào 3 cạnh của một tam giác kiểm tra xem
        * nếu 3 cạnh đấy thỏa mãn điều kiện
        * trở thành 1 tam giác thì cho phép tính diện tích và chu vi
        * nếu không thì bắt người dùng nhập lại
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập cạnh 1 của tam giác:");
        double triangleSide1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập vào cạnh 2 của tam giác:");
        double triangleSide2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập vào cạnh 3 của tam giác:");
        double triangleSide3 = Double.parseDouble(scanner.nextLine());;
        double perimeter = triangleSide1 +triangleSide2+triangleSide3;
        double demo = (perimeter/2) * ((perimeter/2)-triangleSide1) * ((perimeter/2)-triangleSide2) * ((perimeter/2)-triangleSide3);
        double area = Math.sqrt(demo);
        if ((triangleSide3 + triangleSide3 > triangleSide2) &&
            (triangleSide2 + triangleSide3 > triangleSide3) &&
            (triangleSide3 + triangleSide2 > triangleSide3)) {
            System.out.println("chu vi của tam giác là: " + perimeter);
            System.out.println("diện tích của tam giác là: " + area);
        }else {
            System.out.println("Mời nhập lại cạnh tam giác");
        }
    }
}
