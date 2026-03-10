public class Funcionario {
    String nome;
    double salarioBruto;
    double taxa;

    public double taxaSalario(){
        return salarioBruto - taxa;
    }
    public double aumSalario(int porcento){

       return salarioBruto * porcento / 100;
    }
}
