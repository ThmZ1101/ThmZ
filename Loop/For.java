package Loop;

import java.util.Scanner;

public class For {
    Scanner sc = new Scanner(System.in);

    public void f1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("O nº da Iteração é" + i);
        }
    }
    public void f2(){
        double car[] = new double[]{24,24,25,25,26};
        double fi = 0;
        for (int i = 0; i < car.length; i++) {
            fi += car[i];

            
        }
    }
    public void exe1(){
        String le[] = new String[10];
        for (int i = 0; i < le.length; i++) {
            System.out.println("Digite a "+i+" Letra");
            le[i] = sc.nextLine();
        }
        for (int i = 0; i < le.length; i++) {
            if(le[i].equals("A") || le[i].equals("E")||le[i].equals("I")||le[i].equals("O")||le[i].equals("U")){
            }else{
                System.out.println(le[i]);
            }
            
        }
    }
}
