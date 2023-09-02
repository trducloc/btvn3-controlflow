import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {

        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();

        System.out.print("Các ước số của " + n + " là: ");
        int x = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " " );
                x++;
            }
        }
        System.out.println("\nSố lượng ước số của " +n+ " là: " +x);
    }
}
