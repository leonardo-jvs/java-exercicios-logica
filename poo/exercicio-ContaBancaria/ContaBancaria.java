public class ContaBancaria {
    private int numConta;
    private String nome;
    private double saldo;

    public ContaBancaria(int numConta, String nome){
        this.numConta = numConta;
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void depositar(double deposito){
          this.saldo += deposito;
    }
    public void sacar (double saque){
        this.saldo = (saldo - saque) - 5.0;
    }
    public String toString(){
        return "Dados da conta: \n" + "Numero da conta: " + getNumConta() + " Titular: " + getNome() + " Saldo: $" + getSaldo();
    }
}
