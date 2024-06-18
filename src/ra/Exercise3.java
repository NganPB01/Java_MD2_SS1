package ra;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhập vào chiều dài cạnh hình vuông r: ");
        double r = scanner.nextDouble();
        double cv = r * 4;
        double dt = r * r;
        System.out.println("Chu vi của hình vuông là: " + cv);
        System.out.println("Diện tích của hình vuông là: " + dt);
    }
}
