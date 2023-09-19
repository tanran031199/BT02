package BT.BT08;

import java.util.Scanner;

public class BaiTap08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTriangle = true;

        do {
            System.out.println("Nhập các cạnh hình tam giác:");

            System.out.println("Cạnh a:");
            double a = sc.nextDouble();
            if(a < 0) {
                System.out.println("Cạnh tam giác không hợp lệ\n");
                continue;
            }

            System.out.println("Canhk b:");
            double b = sc.nextDouble();
            if(b < 0) {
                System.out.println("Cạnh tam giác không hợp lệ\n");
                continue;
            }

            System.out.println("Canhk c:");
            double c = sc.nextDouble();
            if(c < 0) {
                System.out.println("Cạnh tam giác không hợp lệ\n");
                continue;
            }

            if (a + b > c && a + c > b && b + c > a) {
                double p = a + b + c;

                System.out.printf("Diện tích của tam giác là: %.2f\n" +
                                "Chu vi của tam giác là: %.2f\n\n",
                        Math.sqrt(p / 2 * (p / 2 - a) * (p / 2 - b) * (p / 2 - c)),
                        p);
                isTriangle = false;
            } else {
                System.out.println("Cạnh tam giác không hợp lệ\n");
            }
        } while(isTriangle);

    }
}
