import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı
        grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
         N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        Java ile kombinasyon hesaplayan program yazınız.
        Kombinasyon formülü:  C(n,r) = n! / (r! * (n-r)!) */
        Scanner scanner = new Scanner(System.in);
        int n, r;
        System.out.print("Please enter number N: ");
        n = scanner.nextInt();

        System.out.println("Please enter number r");
        r = scanner.nextInt();

        int nFactorial = factorial(n), rFactorial = factorial(r), c = nFactorial / (rFactorial * factorial(n-r));
        System.out.println("C(n,r) = " + c);

    }
    public static int factorial (int n) {
        int factorial = 1;
        for (int i = 1; i<=n; i++) {
            i *= factorial;
        }
        return factorial;
    }
}