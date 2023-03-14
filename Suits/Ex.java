package Suits;

import java.util.Scanner;

public class Ex {
    Scanner sc = new Scanner(System.in);
    public void exe1(){
        System.out.println("Digite um unica letra: ");
        String letra = sc.nextLine();
        String l1 = "";
        letra = letra.toUpperCase();
        switch (letra) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U": l1="Vogal";
            break;
            default: l1="Consoante";
        }
        System.out.println("Essa letra é uma "+l1);
    }
    public void exe2(){
        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();
        String m = "";
        switch (n1) {
            case 1: m = "Janeiro";
            break; 
            case 2: m = "Fevereiro";
            break;
            
            case 3: m = "Março";
            break;
            case 4: m = "Abril";
            break;
            case 5: m = "Maio";
            break;
            case 6: m = "Junho";
            break;
            case 7: m = "Julho";
            break;
            case 8: m = "Agosto";
            break;
            case 9: m = "Setembro";
            break;
            case 10: m = "Outubro";
            break;
            case 11: m = "Novembro";
            break;
            case 12: m = "Dezembro";
            break;
            default: m = "[nâo encontrado]";
        }
        System.out.println("O mês é "+m);
    }
    
}
