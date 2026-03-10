import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario();

        System.out.println("Nome do funcionario: ");
        f1.nome = sc.nextLine();

        System.out.println("Salario bruto: ");
        f1.salarioBruto = sc.nextDouble();

        System.out.println("Taxa: ");
        f1.taxa = sc.nextDouble();

        f1.taxaSalario();

        System.out.println();
        System.out.println("Funcionario: " + f1.nome + ", $" + f1.taxaSalario());

        System.out.println("Quantos porcento voce quer aumentar no salario ? ");
        double newSalario = f1.aumSalario(sc.nextInt());

        newSalario += f1.taxaSalario();

        System.out.println("Dados atualizados: " + f1.nome + ", $" + newSalario);

        sc.close();
    }
}
