import java.util.Scanner;

////COPY GOOGLE/////

public class bai3 {
    public static void main(String[] args) {

        System.out.print("Nhập số nguyên dương a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập số nguyên dương b: ");
        int b = new Scanner (System.in).nextInt();

        int ucln = UCLN(a, b);
        System.out.println("Ước chung lớn nhất của " +a+ " và " +b+ " là: " +ucln);
        System.out.println("Bội số chung nhỏ nhất của " +a+ " và " +b+ " là: " + (a * b)/ucln);
    }

    public static int UCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return UCLN(b,a % b);
    }
}
