public class CurrencyConverter {

    public static double coverter(double cotacaoDollar, double quantDollar, int iof){
        double valor = cotacaoDollar * quantDollar;
        double porcentagemIof = valor * iof/100;
        return  valor + porcentagemIof;

    }
}
