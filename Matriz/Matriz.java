package Matriz;

import java.util.Random;
import java.util.Scanner;

public class Matriz {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exe1() {
        int Matriz[][]=new int [10][9];
        for (int i = 0; i <10; i++) {
            for (int j = 0; j <9; j++) {
                Matriz[i][j]= rd.nextInt(9);
            }
        }
        for (int i = 0; i <Matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j <Matriz[0].length; j++) {
                System.out.print(Matriz[i][j]+" ");  
            }
            System.out.println("|");
        }
        System.out.println(Matriz[3][0]+Matriz[3][1]+Matriz[3][2]+Matriz[3][3]+Matriz[3][4]+Matriz[3][5]+Matriz[3][6]+Matriz[3][7]+Matriz[3][8]);
    }
    public void exe2(){
        int Matriz[][]=new int [5][5];
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <5; j++) {
                Matriz[i][j]= rd.nextInt(9);
            }
        }
        for (int i = 0; i <Matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j <Matriz[0].length; j++) {
                System.out.print(Matriz[i][j]+" ");  
            }
            System.out.println("|");
        }
    }
}