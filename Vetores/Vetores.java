package Vetores;

import java.util.Scanner;
import java.lang.Math;
public class Vetores {
    Scanner sc = new Scanner(System.in);
    

    public void exe1() {
        double[] valores = new double[] { 10.5, 20.7, 30.6, 40.4 };
        System.out.println("1º Posição- índice[0]" + valores[0]);
        System.out.println("1º Posição- índice[1]" + valores[1]);
        System.out.println("1º Posição- índice[2]" + valores[2]);
        System.out.println("1º Posição- índice[3]" + valores[3]);
        valores[0] = 15.6;
        System.out.println("1º Posição- Índice[0]" + valores[0]);
    }

    public void exe2() {
        int[] novoValores = new int[5];
        novoValores[0] = 10;
        novoValores[1] = 20;
        novoValores[2] = 35;
        novoValores[3] = 67;
        novoValores[4] = 98;
        System.out.println("O vetor é : posição [0]" + novoValores[0]);
        System.out.println("O vetor é : posição [1]" + novoValores[1]);
        System.out.println("O vetor é : posição [2]" + novoValores[2]);
        System.out.println("O vetor é : posição [3]" + novoValores[3]);
        System.out.println("O vetor é : posição [4]" + novoValores[4]);
    }

    public void exe3() {
        double[] vector = new double[] { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1 };
        System.out.println("O vetor [9] é :" + vector[9]);
        System.out.println("O vetor [8] é :" + vector[8]);
        System.out.println("O vetor [7] é :" + vector[7]);
        System.out.println("O vetor [6] é :" + vector[6]);
        System.out.println("O vetor [5] é :" + vector[5]);
        System.out.println("O vetor [4] é :" + vector[4]);
        System.out.println("O vetor [3] é :" + vector[3]);
        System.out.println("O vetor [2] é :" + vector[2]);
        System.out.println("O vetor [1] é :" + vector[1]);
        System.out.println("O vetor [0] é :" + vector[0]);
    }

    public void exe4() {
        double[] notas = new double[] { 1, 2, 3, 4 };
        System.out.println("Informe a primeira nota: ");
        notas[0] = sc.nextDouble();
        System.out.println("Informe a segunda nota: ");
        notas[1] = sc.nextDouble();
        System.out.println("Informe a terceira nota: ");
        notas[2] = sc.nextDouble();
        System.out.println("Informe a quarta nota: ");
        notas[3] = sc.nextDouble();
        double meida = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        System.out.println("Primeira nota: " + notas[0] + " Segunda Nota:" + notas[1] + " Terceira nota: " + notas[2] +
                "Quarta nota: " + notas[3] + " Media: " + meida);
    }

    public void exe5(){
        double[] numeros = new double[10];
        System.out.println("Digite os valor 1:");
        numeros[0] = sc.nextDouble();
        System.out.println("Digite os valor 2:");
        numeros[1] = sc.nextDouble();
        System.out.println("Digite os valor 3:");
        numeros[2] = sc.nextDouble();
        System.out.println("Digite os valor 4:");
        numeros[3] = sc.nextDouble();
        System.out.println("Digite os valor 5:");
        numeros[4] = sc.nextDouble();
        System.out.println("Digite os valor 6:");
        numeros[5] = sc.nextDouble();
        System.out.println("Digite os valor 7:");
        numeros[6] = sc.nextDouble();
        System.out.println("Digite os valor 8:");
        numeros[7] = sc.nextDouble();
        System.out.println("Digite os valor 9:");
        numeros[8] = sc.nextDouble();
        System.out.println("Digite os valor 10:");
        numeros[9] = sc.nextDouble();
        System.out.println("Valor 10:"+numeros[9]+"Valor 9:"+numeros[8]+"Valor 8:"+numeros[7]+"Valor 7:"+numeros[6]+"Valor 6:"+numeros[5]+"Valor 5:"+numeros[4]+"Valor 4:"+numeros[3]+"Valor 3:"+numeros[2]+"Valor 2:"+numeros[1]+"Valor 1:"+numeros[0]);
    }
    public void exe6(){
        int[] A = new int[5];
        A[0] = 10;
        A[1] = 20;
        A[2] = 30;
        A[3] = 40;
        A[4] = 50;
        int[] B = new int[5];
        B[0] = 10;
        B[1] = 20;
        B[2] = 30;
        B[3] = 40;
        B[4] = 50;
    }
    public void exe7(){
        int[] A = new int[]{3,4,5,6,7,8,9,10};
        int[] B = new int[A.length];
        int i = 0;
        while (i<A.length) {
            B[i]=A[i]*2;
            System.out.println("B"+i+"="+B[i]);
            i++;
            
        }
    }
    public void exe8(){
        int[] A =new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] B =new int[A.length];
        int i = 0;
        while (i<A.length) {
            B[i]=A[i]*A[i];
            System.out.println("B"+i+"="+B[i]);
            i++;
            
        }
    }
    public void exe9(){
        int[] A =new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        double[] B =new double[15];
        int i = 0;
        while (i<A.length){
            B[i]=Math. sqrt(A[i]);
            System.out.println("B"+i+"="+B[i]);
            i++;

        }
    }
    public void exe10(){
        int[] A =new int[]{1,2,3,4,5,6,7,8,9,10};
        double[] B =new double[10];
        int i = 0;
        while (i<A.length) {
            B[i] = A[i]*i;
            System.out.println("B"+i+"="+B[i]);
            i++;
        }
    }
    public void exe11(){
        int[] A =new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] B = new int[]{10,9,8,7,6,5,4,3,2,1};
        double[] C = new double[10];
        int i = 0 ;
        while (i<A.length) {
            C[i] = A[i]+B[i];
            System.out.println("C"+i+"="+C[i]);
            i++;
        }

        

    }
}