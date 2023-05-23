package Formativa;

import java.util.Random;
import java.util.Scanner;

public class Formativa {
    Random rd = new Random(0);
    Scanner sc = new Scanner(System.in);

    public void exe1() {
        System.out.println("Vamos criar uma matriz!");
        System.out.print("Digite o numero de linhas: ");
        int nLinhas = sc.nextInt();
        System.out.print("Digite o numero de colunas: ");
        int nColunas = sc.nextInt();

        int matriz[][] = new int[nLinhas][nColunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }

        System.out.println("A matriz com os valores randomizados fica:");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" | ");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 2;
                }
            }
        }
        System.out.println("Substituindo os valores: ");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" | ");
        }
    }

    public void exe2() {
        int nSorteado = rd.nextInt(1000);
        int cont = 1;
        System.out.println("Digite um N°");
        int nDigitado = sc.nextInt();
        while (nSorteado != nDigitado) {
            System.out.println("DIgite outro N°");
            nDigitado = sc.nextInt();
            cont++;
            // condição
            if (nDigitado == nSorteado) {
                // vai sair do loop
            } else if (nDigitado > nSorteado) {
                System.out.println("O N° é maior que o Sorteado");
            } else {
                System.out.println("O N° é Menor que o Sorteado");
            }
        }
        System.out.println("Parabens você acertou");
        System.out.println("Em " + cont + " tentativas");
    }

    public void exe3() {
        int tamanhoVetor = (rd.nextInt(900)+100);
        int vetor[] = new int[tamanhoVetor];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (rd.nextInt(99)+1);
        }

        System.out.println("Os números pares no vetor são: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2 == 0) {
                System.out.println("vetor["+i+"]= "+vetor[i]);
            }
        }
        System.out.println("=======================================");
        System.out.println("Os números ímpares no vetor são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2 == 1) {
                System.out.println("vetor["+i+"]= "+vetor[i]);
            }
        }
        System.out.println("=============================================");
        System.out.println("Os números pares nas posições ímpares são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2 == 0 && (i+1)%2 == 1) {
                System.out.println("Vetor posição: "+(i+1)+" = "+vetor[i]);
            }
        }
        System.out.println("=============================================");
        System.out.println("Os números ímpares nas posições pares são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2 == 1 && (i+1)%2 == 0) {
                System.out.println("Vetor posição: "+(i+1)+" = "+vetor[i]);
        }
    }
}}
