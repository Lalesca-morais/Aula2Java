import java.util.Scanner;
public class ExerQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor inteiro para N: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

