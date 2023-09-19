package BT.BT02;

public class BaiTap02 {
    public static void main(String[] args) {
        int cd = 10;
        int cr = 5;
        rectangle(cd, cr);

        int col = 5;
        triangle(col);
        reverseTriangle(col);

    }

    public static void rectangle(int cd, int cr) {
        for (int i = 1; i <= cr; i++) {
            for (int j = 1; j <= cd; j++) {
                if (j == cd) {
                    System.out.print("\n");
                } else {
                    System.out.print("*");
                }
            }
        }
    }

    public static void triangle(int col) {
        for (int i = 1; i <= col; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void reverseTriangle(int col) {
        for (int i = 1; i <= col; i++) {
            for (int j = col; j >= i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
