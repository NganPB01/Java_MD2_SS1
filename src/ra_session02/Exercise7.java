package ra_session02;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("******Chọn chức năng để sử dụng******");
            System.out.println("Bấm 1: Kiểm tra chẵn lẻ của số");
            System.out.println("Bấm 2: Kểm tra số có là số nguyên tố không");
            System.out.println("Bấm 3: Kiểm tra số chia hết cho 3 hay không");
            System.out.println("Bấm 4: Thoát");
            System.out.println("Mời nhập số:");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("mời chọn chức năng số: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Kiểm tra chẵn lẻ của số" +number);
                    if (number%2 == 0){
                        System.out.println(number + " là số chẵn");
                    }else {
                        System.out.println(number + " là số lẻ");
                    }
                    break;
                case 2:
                    System.out.println("Bấm 2: Kểm tra số" + number + "có là số nguyên tố không");
                    int i;
                    for (i = 2; i < number; i++) {
                        if (number%i==0) {
                            break;
                        }
                    }
                    if (number == i) {
                        System.out.println(number + " là số nguyên tố");
                    } else {
                        System.out.println(number + " không phải số nguyên tố");
                    }
                    break;
                case 3:
                    System.out.println("Bấm 3: Kiểm tra số" + number + " chia hết cho 3 hay không");
                    if (number%3==0){
                        System.out.println(number + " chia hết cho 3");
                    }else{
                        System.out.println(number + "không chia hết cho 3");
                    }
                    break;
                case 4:
                    System.out.println("Bấm 4: Thoát");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng nhập từ 1-4");
            }
        }while (true);
    }
}
