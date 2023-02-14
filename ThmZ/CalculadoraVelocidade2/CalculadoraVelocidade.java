package ThmZ.CalculadoraVelocidade2;

import java.util.Scanner;

public class CalculadoraVelocidade {
    Scanner sc = new Scanner(System.in);
    public void calcular() {

        System.out.println("Informe a distancia percorrida");
        double distanciaPercorrida = sc.nextDouble();
        System.out.println("Informe o tempo gasto");
        double tempoGasto = sc.nextDouble();
        double velocidadeMedia = distanciaPercorrida/tempoGasto;
        System.out.println("A velocidade Média é"+velocidadeMedia+"Km/H");

        System.out.println("==============================================");
    }
    public void Viagem() {
        System.out.println("Informe seu local de saida.");
        String localSaida = sc.next();
        System.out.println("Informe seu local de destino.");
        String localDestino = sc.next();
        System.out.println("Sua viagem partira de " +localSaida+ " com destino a " +localDestino);

    }
}
