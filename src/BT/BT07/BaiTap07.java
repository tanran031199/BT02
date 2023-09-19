package BT.BT07;

import java.util.Scanner;

public class BaiTap07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Chọn hình mà bạn muốn tính diện tích và chu vi:\n" +
                    "1. Hình chữ nhật.\n" +
                    "2. Hình tam giác.\n" +
                    "3. Hình tròn.\n" +
                    "0. Thoát");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập chiều dài: ");
                    int cd = sc.nextInt();
                    System.out.println("Nhập chiều rộng: ");
                    int cr = sc.nextInt();

                    System.out.printf(cd < cr ?
                            "Chiều dài không thể lớn hơn chiều rộng" :
                            "Diện tích của hình chữ nhật là: %d\n" +
                                    "Chu vi của hình chữ nhật là: %d\n\n", cd * cr, (cd + cr) * 2);
                    break;
                case 2:
                    System.out.println("Nhập các cạnh hình tam giác:");

                    System.out.println("Cạnh a:");
                    double a = sc.nextDouble();
                    if(a < 0) {
                        System.out.println("Cạnh tam giác không hợp lệ\n");
                        break;
                    }

                    System.out.println("Canhk b:");
                    double b = sc.nextDouble();
                    if(b < 0) {
                        System.out.println("Cạnh tam giác không hợp lệ\n");
                        break;
                    }

                    System.out.println("Canhk c:");
                    double c = sc.nextDouble();
                    if(c < 0) {
                        System.out.println("Cạnh tam giác không hợp lệ\n");
                        break;
                    }

                    if (a + b > c && a + c > b && b + c > a) {
                        double p = a + b + c;

                        System.out.printf("Diện tích của tam giác là: %.2f\n" +
                                        "Chu vi của tam giác là: %.2f\n\n",
                                Math.sqrt(p / 2 * (p / 2 - a) * (p / 2 - b) * (p / 2 - c)),
                                p);
                    } else {
                        System.out.println("Cạnh tam giác không hợp lệ");
                    }
                    break;
                case 3:
                    System.out.println("Nhập bán kính hình tròn:");
                    double r = sc.nextDouble();
                    final double PI = 3.14;

                    System.out.printf("Diện tích của hình tròn là: %.2f\n" +
                                    "Chu vi của hình tròn là: %.2f\n\n",
                            Math.pow(r, 2) * PI,
                            2 * PI * r);
                    break;
                case 0:
                    System.out.println("Bạn đã thoát chương trình");
                    break;
                default:
                    System.out.printf("Không có lựa chọn %d!!! Xin hãy nhập lại.\n\n", choice);
                    break;

            }

        } while (choice != 0);
    }
}
