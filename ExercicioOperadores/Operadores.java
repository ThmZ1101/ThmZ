package ExercicioOperadores;

import java.util.Scanner;

public class Operadores {
    Scanner sc = new Scanner(System.in);
    
    public void calcular(){
        System.out.println("Informe a nota 1");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota 2");
        int nota2 = sc.nextInt();
        double media1 = (nota1+nota2)/2;
        System.out.println("A media do aluno é "+media1);
        boolean media = media1>=50;
        System.out.println("O aluno esta aprovado por nota? "+media);
        System.out.println("Informe a Frequência do Aluno");
        int frequência = sc.nextInt();
        boolean frequência1 = frequência>=75;
        System.out.println("O Aluno esta aprovado por frequência? "+frequência1);
        boolean aprovado = (media==true) && (frequência1==true);
        System.out.println("============-===========-============-===========");
        System.out.println("O Aluno esta aprovado no curso? "+aprovado);
    }
}
