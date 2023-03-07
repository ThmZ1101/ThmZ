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
        double media = 50;
        if(media1 >= media){
            System.out.println("O aluno esta aprovado por nota!! :D");
        }else{
            System.out.println("O aluno esta reprovado por nota!! D:");
        }
        System.out.println("Informe a Frequência do Aluno");
        int frequência = sc.nextInt();
        double frequência1 = 75;
        if(frequência >= frequência1){
            System.out.println("O aluno esta aprovado por frequência!! :D");
        }else{
            System.out.println("O aluno esta reprovado por frequência");
        }
        if(media1 >= media && frequência >= frequência1){
            System.out.println("O aluno esta aprovado!! :D");
        }else{
            System.out.println("O aluno esta reprovado D:");
        }
    }
}
