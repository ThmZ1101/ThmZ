package Exercicios;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);
    public void exe1(){
        System.out.println("Informe um numero:");
        double numero1 = sc.nextDouble();
        System.out.println("Informe outro numero:");
        double numero2 = sc.nextDouble();
        if (numero1>numero2){
            System.out.println("O maior numero é: "+numero1);
        } else {
            System.out.println("O maior numero é: "+numero2);
        }
    }
    public void exe2(){
        System.out.println("Informe o ano de nacimento: ");
        double ano = sc.nextDouble();
        double ano2 = 2023-ano;
        if(ano2>=16){
            System.out.println("Você podera votar esse ano!!");
        }else{
            System.out.println("Você não podera votar esse ano!!");
        }
    }
    public void exe3(){
        System.out.println("Informe a senha:");
        double s1 = sc.nextDouble();
        double s2 = 1234;
        if(s1==s2){
            System.out.println("ACESSO PERMITIDO");
        }else{
            System.out.println("ACESSO NEGADO");
        }
    }
    public void exe4(){
        System.out.println("Informe a quantidade de maças:");
        double quantidade = sc.nextDouble();
        double preco;
        if(quantidade==12){
            preco = 0.25;
        }else{
            preco = 0.30;
        }
        double custo = quantidade*preco;
        System.out.println("O custo total será: R$"+custo);
    }
    public void exe5(){
        System.out.println("Infomer o primeiro numero: ");
        double n1 = sc.nextDouble();
        System.out.println("Infomer o segundo numero: ");
        double n2 = sc.nextDouble();
        System.out.println("Infomer o terceiro numero: ");
        double n3 = sc.nextDouble();
        double maior,menor,meio;
        if(n1>n2 && n1>n3 ){
            maior=n1;
        }else if(n2>n3 && n2<n3){
            meio=n2;
            menor=n3;
            //n1 maior n2 meio n3 menor
        }if(n2>n1 && n2>n3){
            maior=n2;
        }else if(n1<n2 && n1>n3){
            meio=n1;
            menor=n3;
            //n2 maior n1 meio n3 menor
        }if(n1>n2 &&n1>n3){
            maior=n1;
        }else if(n3>n2 && n3<n1){
            meio=n3;
            menor=n2;
            //n1 maior n3 meio n2 menor
        }
    }
}
