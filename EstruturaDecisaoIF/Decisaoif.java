package EstruturaDecisaoIF;

import java.util.Scanner;

public class Decisaoif {
    Scanner sc = new Scanner(System.in);

    public void descontoIf() {
        System.out.println("Informe a preço do poduto:");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;
        if (precoProduto >= 100) {
            desconto = 5.0;
        }
        if (precoProduto >= 200) {
            desconto = 10.0;
        }
        if (precoProduto >= 300) {
            desconto = 15.0;
        }
        double valorDesconto = precoProduto * desconto / 100;
        double precoFinal = precoProduto - valorDesconto;
        System.out.println("O preço final do profuto é: " + precoFinal);
    }

    public void descontoTH() {
        System.out.println("Informe o preço do poduto:");
        double precoProduto = sc.nextDouble();
        double desconto;
        if (precoProduto >= 100) {
            desconto = 5.0;
        } else {
            desconto = 0.0;
        }
        double valorDesconto = precoProduto * desconto / 100;
        double precoFinal = precoProduto - valorDesconto;
        System.out.println("O valor do produto é R$ " + precoFinal);
    }
}
