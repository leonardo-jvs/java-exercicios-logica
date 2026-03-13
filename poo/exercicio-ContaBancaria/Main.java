import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int numConta = sc.nextInt();
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        ContaBancaria c1 = new ContaBancaria(numConta, nome);
        System.out.println("Voce deseja fazer um deposito inicial ? (S/N) ");
        char escolha = sc.next().charAt(0);
        if (escolha == 's' ){
            System.out.println("digite o valor que deseja depositar : ");
            c1.depositar(sc.nextDouble());

        }
        System.out.println(c1.toString());

        System.out.println("Faça um novo deposito, Digite o valor desejado: ");
        c1.depositar(sc.nextDouble());
        System.out.println("Dados Atualizados: ");
        System.out.println(c1.toString());

        System.out.println("Quanto deseja sacar: " );
        c1.sacar(sc.nextDouble());
        System.out.println("Dados Atualizados: ");
        System.out.println(c1.toString());


        sc.close();
    }
}
