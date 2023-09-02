import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        System.out.print("Nhap so nguyen a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhap so nguyen b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Nhap so nguyen c: ");
        int c = new Scanner(System.in).nextInt();
        System.out.print("Nhap so nguyen d: ");
        int d = new Scanner(System.in).nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        System.out.println("Số lớn nhất trong 4 số vừa nhập là: " + max);
    }
}