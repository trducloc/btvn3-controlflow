import java.util.Scanner;
public class bai15 {
    public static void main(String[] args) {

        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Các số chẵn nhỏ hơn " + n + " là:");
        for (int i = 0; i < n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\nCác số lẻ nhỏ hơn " + n + " là:");
        for (int i = 1; i < n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
