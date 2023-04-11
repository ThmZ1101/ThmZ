package Loop;

import java.util.Random;
import java.util.Scanner;

public class Loop {
    Scanner sc = new Scanner(System.in);
    public void l1(){
        int i = 1;
        while (i>0) {
            System.out.println("O nº da interação é "+i);
            i = i*2;
        }
    }
    public void l2(){
        int vetor[] = new int[10];
        int i=0;
        while(i<10){
            System.out.println("Informe o valor do vetor["+i+"]=");
            vetor[i]=sc.nextInt();
            i++;
        }
        while (i>0) {   
            i--;
            System.out.println("vetor["+i+"]="+vetor[i]);
            
        }
    }
    public void l3(){
        Random rd = new Random();
        int nale = rd.nextInt(10)+1;
        boolean tete = true;
        while (tete) {
            System.out.println("Digite um nº de 1 a 10");
            int nd = sc.nextInt();
            if(nd == nale){
                System.out.println("Acertou krl");
                tete = false;
            }else{
                System.out.println("Errou krl");
            }
            
        }
    }
    
}
