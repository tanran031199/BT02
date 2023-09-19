package BT.BT06;

import java.util.Scanner;

public class BaiTap06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Nhập lựa chọn của bạn:\n" +
                    "1. kiểm tra số chẵn lẻ.\n" +
                    "2. kiểm tra số nguyên tố.\n" +
                    "3. kiểm tra chia hết cho 3.\n" +
                    "0. thoát chương trình.");
            choice = sc.nextInt();

            int number;

            switch (choice) {
                case 2:
                    System.out.println("Nhập số cần kiểm tra: ");
                    number = sc.nextInt();
                    boolean isPrime = true;

                    for (int i = 2; i <= Math.sqrt(number); i++) {
                        if (number % i == 0) {
                            isPrime = false;
                        }
                    }

                    if (isPrime) {
                        System.out.println(number + " là số nguyên tố\n");
                    } else {
                        System.out.println(number + " không là số nguyên tố\n");
                    }

                    break;
                case 1:
                    System.out.println("Nhập số cần kiểm tra: ");
                    number = sc.nextInt();
                    System.out.println(number % 2 == 0 ? number + " là số chẵn\n" : number + " là số lẻ\n");
                    break;
                case 3:
                    System.out.println("Nhập số cần kiểm tra: ");
                    number = sc.nextInt();
                    System.out.println(number % 3 == 0 ? number + " là số chia hết cho 3\n" : number + " là số không chia hết cho 3\n");
                    break;
                case 0:
                    System.out.println("Bạn đã thoát chương trình!!!");
                    break;
                default:
                    System.out.printf("Không có lựa chọn %d!!! Xin hãy nhập lại\n\n", choice);
                    break;
            }
        } while (choice != 0);
    }
}
