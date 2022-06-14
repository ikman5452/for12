import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double p = 1, x;
        double n;
        Scanner num = new Scanner(System.in);
        n = num.nextDouble();
        for (double i = 1; i <= n; i++) {
            x = 1 + i * 0.1;
            p *= x;
        }
        System.out.println("Hosili zarb: " + p);
    }
}