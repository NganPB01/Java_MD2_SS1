package ra_session02;

import java.util.Scanner;

public class Exercise0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập tuổi: ");
        float age = Float.parseFloat(scanner.nextLine());
        final float BUS_TICKET = 7000;
        float ticket;
        if(age < 6 || age >= 60){
            ticket = 0;
        } else if (age < 18) {
            ticket = 0.5F * BUS_TICKET;
        } else {
            ticket = BUS_TICKET;
        }
        System.out.println("Giá xe buýt là " + ticket + "VND");
    }
}
