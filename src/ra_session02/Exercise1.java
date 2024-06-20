package ra_session02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        * Xây dựng một ứng dụng cho phép người
        *  dùng nhập vào 1 số tự nhiên và kiểm tra xem
        * số đó có chia hết cho 3 và 5 hay không
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào một số nguyên:");
        float number = Float.parseFloat(scanner.nextLine());
        if(number%3==0 && number%5==0){
            System.out.printf("số %f chia hết cho 3 và 5", number);
        }else {
            System.out.printf("số %f không chia hết cho 3 và 5", number);
        }

    }
}
