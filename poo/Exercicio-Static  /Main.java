import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int iof = 6;
        System.out.println("What is the dollar price? ");
        double cotacaoDollar = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double quantDollar = sc.nextDouble();
        double reais = CurrencyConverter.coverter(cotacaoDollar,quantDollar,iof);
        System.out.printf("Amount to be oaid in reais = %.2f ", reais);
        sc.close();
    }

}
