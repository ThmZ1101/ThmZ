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
        double pre = (tt-falta)*100/tt;
        System.out.println("O aluno esve presente em " + pre + " aulas");
        if (media >= 50 && pre >= 75) {
            System.out.println("O aluno esta aprovado");
        } else {
            System.out.println("O aluno esta repovado");
        }
    }
}
