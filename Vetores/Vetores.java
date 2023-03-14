package Vetores;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);
    public void exe1(){
        double[] valores = new double[]{10.5,20.7,30.6,40.4};
        System.out.println("1º Posição- índice[0]"+valores[0]);
        System.out.println("1º Posição- índice[1]"+valores[1]);
        System.out.println("1º Posição- índice[2]"+valores[2]);
        System.out.println("1º Posição- índice[3]"+valores[3]);
        valores[0] = 15.6;
        System.out.println("1º Posição- Índice[0]"+valores[0]);
    }
    public void exe2(){
        int[] novoValores = new int[5];
        novoValores[0]= 10;
        novoValores[1]= 20;
        novoValores[2]= 35;
        novoValores[3]= 67;
        novoValores[4]= 98;
        System.out.println("O vetor é : posição [0]"+novoValores[0]);
        System.out.println("O vetor é : posição [1]"+novoValores[1]);
        System.out.println("O vetor é : posição [2]"+novoValores[2]);
        System.out.println("O vetor é : posição [3]"+novoValores[3]);
        System.out.println("O vetor é : posição [4]"+novoValores[4]);
    }
    public void exe3(){
        double[] vector = new double[]{1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.1};
        System.out.println("O vetor [9] é :"+vector[9]);
        System.out.println("O vetor [8] é :"+vector[8]);
        System.out.println("O vetor [7] é :"+vector[7]);
        System.out.println("O vetor [6] é :"+vector[6]);
        System.out.println("O vetor [5] é :"+vector[5]);
        System.out.println("O vetor [4] é :"+vector[4]);
        System.out.println("O vetor [3] é :"+vector[3]);
        System.out.println("O vetor [2] é :"+vector[2]);
        System.out.println("O vetor [1] é :"+vector[1]);
        System.out.println("O vetor [0] é :"+vector[0]);
    }
    public void exe4(){
        double[] notas = new double[]{1,2,3,4};
        System.out.println("Informe a primeira nota: ");
        notas[0] = sc.nextDouble();
        System.out.println("Informe a segunda nota: ");
        notas[1] = sc.nextDouble();
        System.out.println("Informe a terceira nota: ");
        notas[2] = sc.nextDouble();
        System.out.println("Informe a quarta nota: ");
        notas[3] = sc.nextDouble();
        double meida = (notas[0] + notas[1] + notas[2] + notas[3])/4;
        System.out.println("Primeira nota: "+notas[0]+" Segunda Nota:"+notas[1]+" Terceira nota: "+notas[2]+
        "Quarta nota: "+notas[3]+" Media: "+meida);
    }
}
