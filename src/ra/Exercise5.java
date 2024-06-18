package ra;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào bán kính đường tròn r:");
        double r = sc.nextDouble();
        double cv = 2 * Math.PI * r;
        double dt = Math.PI * Math.pow(r, 2);
        System.out.println("Chu vi của đường tròn là: " + cv);
        System.out.println("Diện tích của đường tròn là: " + dt);
    }
}
