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
        int[] A = new int[8];
        System.out.println("Digite os numeros inteiros: 1°");
        A[0] = sc.nextInt();
        System.out.println("2°");
        A[1] = sc.nextInt();
        System.out.println("3°");
        A[2] = sc.nextInt();
        System.out.println("4°");
        A[3] = sc.nextInt();
        System.out.println("5°");
        A[4] = sc.nextInt();
        System.out.println("6°");
        A[5] = sc.nextInt();
        System.out.println("7°");
        A[6] = sc.nextInt();
        System.out.println("8°");
        A[7] = sc.nextInt();
        int[] B = new int[8];
        B[0] = A[0] * 2;
        B[1] = A[1] * 2;
        B[2] = A[2] * 2;
        B[3] = A[3] * 2;
        B[4] = A[4] * 2;
        B[5] = A[5] * 2;
        B[6] = A[6] * 2;
        B[7] = A[7] * 2;
        System.out.println("B1 :"+B[0]+" B2 :"+B[1]+" B3 :"+B[2]+" B4 :"+B[3]+" B5 :"+B[4]+" B6 :"+B[5]+" B7 :"+B[6]+" B8 :"+B[7]);
    }
    public void exe8(){
        int[] A =new int[15];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        A[5] = 6;
        A[6] = 7;
        A[7] = 8;
        A[8] = 9;
        A[9] = 10;
        A[10] = 11;
        A[11] = 12;
        A[12] = 13;
        A[13] = 14;
        A[14] = 15;
        int[] B =new int[15];
        B[0] = A[0]*A[0];
        B[1] = A[1]*A[1];
        B[2] = A[2]*A[2];
        B[3] = A[3]*A[3];
        B[4] = A[4]*A[4];
        B[5] = A[5]*A[5];
        B[6] = A[6]*A[6];
        B[7] = A[7]*A[7];
        B[8] = A[8]*A[8];
        B[9] = A[9]*A[9];
        B[10] = A[10]*A[10];
        B[11] = A[11]*A[11];
        B[12] = A[12]*A[12];
        B[13] = A[13]*A[13];
        B[14] = A[14]*A[14];
    }
    public void exe9(){
        int[] A =new int[15];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        A[5] = 6;
        A[6] = 7;
        A[7] = 8;
        A[8] = 9;
        A[9] = 10;
        A[10] = 11;
        A[11] = 12;
        A[12] = 13;
        A[13] = 14;
        A[14] = 15;
        double[] B =new double[15];
        B[0] = Math. sqrt(A[0]);
        B[1] = Math. sqrt(A[1]);
        B[2] = Math. sqrt(A[2]);
        B[3] = Math. sqrt(A[3]);
        B[4] = Math. sqrt(A[4]);
        B[5] = Math. sqrt(A[5]);
        B[6] = Math. sqrt(A[6]);
        B[7] = Math. sqrt(A[7]);
        B[8] = Math. sqrt(A[8]);
        B[9] = Math. sqrt(A[9]);
        B[10] = Math. sqrt(A[10]);  
        B[11] = Math. sqrt(A[11]);
        B[12] = Math. sqrt(A[12]);
        B[13] = Math. sqrt(A[13]);
        B[14] = Math. sqrt(A[14]);
    }
    public void exe10(){
        int[] A =new int[10];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        A[5] = 6;
        A[6] = 7;
        A[7] = 8;
        A[8] = 9;
        A[9] = 10;
        A[10] = 11;
        double[] B =new double[10];
        B[0] = A[0]*0;
        B[1] = A[1]*1;
        B[2] =A[2]*2;
        B[3] =A[3]*3;
        B[4] =A[4]*4;
        B[5] =A[5]*5;
        B[6] =A[6]*6;
        B[7] =A[7]*7;
        B[8] = A[8]*8;
        B[9] = A[9]*9;
        B[10] =A[10]*10;
    }
    public void exe11(){
        int[] A =new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] B = new int[]{10,9,8,7,6,5,4,3,2,1};
        double[] C = new double[10];
        C[0] = A[0]+B[0];
        C[1] = A[1]+B[1];
        C[2] = A[2]+B[2];
        C[3] = A[3]+B[3];
        C[4] = A[4]+B[4];
        C[5] = A[5]+B[5];
        C[6] = A[6]+B[6];
        C[7] = A[7]+B[7];
        C[8] = A[8]+B[8];
        C[9] = A[9]+B[9];
        C[10] =A[10]+B[10];

    }
}