package Algoritimo;

import java.util.Scanner;

public class algo {
    Scanner sc = new Scanner(System.in);

    public void calc() {
        System.out.println("Primeira nota :");
        double n1 = sc.nextDouble();
        System.out.println("Segunda nota: ");
        double n2 = sc.nextDouble();
        double media = (n1 + n2) / 2;
        System.out.println("A media do aluno é :" + media);
        System.out.println("Total de aulas dadas :");
        double tt = sc.nextDouble();
        System.out.println("Total de faltas do aluno :");
        double falta = sc.nextDouble();
        double pre = (tt - falta) * 100 / tt;
        System.out.println("O aluno esve presente em " + pre + " aulas");
        if (media >= 50 && pre >= 75) {
            System.out.println("O aluno esta aprovado");
        } else {
            System.out.println("O aluno esta repovado");
        }
    }

    public void binario() {
        System.out.println("1°");
        int n1 = sc.nextInt();
        System.out.println("2°");
        int n2 = sc.nextInt();
        System.out.println("3°");
        int n3 = sc.nextInt();
        System.out.println("4°");
        int n4 = sc.nextInt();
        System.out.println("5°");
        int n5 = sc.nextInt();
        System.out.println("6°");
        int n6 = sc.nextInt();
        System.out.println("7°");
        int n7 = sc.nextInt();
        System.out.println("8°");
        int n8 = sc.nextInt();
        int v1 = 0; int v2 = 0; int v3 = 0; int v4 = 0; int v5 = 0; int v6 = 0; int v7 = 0; int v8 = 0;
        if(n1 == 1){
            v1 = 128;
        }if(n2 == 1){
            v2 = 64;
        }if(n3 == 1){
            v3 = 32;
        }if(n4 == 1){
            v4 = 16;
        }if(n5 == 1){
            v5 = 8;
        }if(n6 == 1){
            v6 = 4;
        }if(n7 == 1){
            v7 = 2;
        }if(n8 == 1){
            v8 = 1;
        }
        int res = v1+v2+v3+v4+v5+v6+v7+v8;
        System.out.println("O valor da sequencia é: "+res);
    }
}
