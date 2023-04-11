package Binario;
import java.util.Scanner;

public class Algo {
    Scanner sc = new Scanner(System.in);

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
    public void decimal(){
        System.out.println("Decimal:");
        int d = sc.nextInt();
        int v1 = 0; int v2 = 0; int v3 = 0; int v4 = 0; int v5 = 0; int v6 = 0; int v7 = 0; int v8 = 0;
        int d1 = d/2;
        int d2 = d1/2;
        int d3 = d2/2;
        int d4 = d3/2;
        int d5 = d4/2;
        int d6 = d5/2;
        int d7 = d6/2;
        if(d % 2 == 1){
            v1 = 1;
        }
        if(d1 % 2 ==1){
            v2 = 1;
        }
        if(d2 % 2 ==1){
            v3 = 1;
        }
        if(d3 % 2 ==1){
            v4 = 1;
        }
        if(d4 % 2 ==1){
            v5 = 1;
        }
        if(d5 % 2 ==1){
            v6 = 1;
        }
        if(d6 % 2 ==1){
            v7 = 1;
        }
        if(d7 % 2 ==1){
            v8 = 1;
        }
        System.out.println(v8+""+v7+""+v6+""+v5+""+v4+""+v3+""+v2+""+v1);
    }
    public void dec(){
        System.out.println("A");
        int n  = sc.nextInt();
        int n1 = n/2;
        System.out.println(n1);

    }
}
