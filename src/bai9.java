import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) {
        System.out.print("Nhập chiều cao của tam giác vuông cân: ");
        int h = new Scanner(System.in).nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print("");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
