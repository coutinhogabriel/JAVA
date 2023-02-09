package Exercicio01CalculoGasto;

public class CalculoGasto {
    public static void main(String[] args) {
        int distanciaPercorrida = 148; // em km
        double precoCombustivel = 5; // em R$
        double consumoVeiculo = 10; // km/L
        double consumoMedio = distanciaPercorrida / consumoVeiculo;
        double valorTotal = consumoMedio * precoCombustivel;
        System.out.println("Gasto total da viagem foi de: R$");
        System.out.print(valorTotal);
    }
}
