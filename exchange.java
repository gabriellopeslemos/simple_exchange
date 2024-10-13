

public class Exchange {
    
    private final double cotacaoDolar = 5.5;
    private final double iof = 0.0586;
    private final double taxaOperacaoEmPercentual = 0.01;
    
    public double comprarDolar(double valorReal){
        
        double valorDolar = valorReal / cotacaoDolar;
        double taxaIOF = valorDolar * iof;
        double taxaOperacao = valorDolar * taxaOperacaoEmPercentual;
        double valorDolarFinal = valorDolar - taxaIOF - taxaOperacao;
        
        return valorDolarFinal;
    }
    
    public static void main (String[] args) {
        Exchange exchange = new Exchange();
        double valorReal = 500;
        double valorDolarFinal = exchange.comprarDolar(valorReal);
        System.out.println("Valor em dólar: " + valorDolarFinal);
    }

}