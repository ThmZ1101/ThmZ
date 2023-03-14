package Extra;

import java.util.Scanner;

public class Extras {
    Scanner sc = new Scanner(System.in);

    public void exe1() {
        System.out.println("Digite um numero inteiro:");
        int N = sc.nextInt();
        if (N % 2 == 0) {
            System.out.println(N + " É um numero par");
        } else {
            System.out.println(N + "É um numero impar");
        }
    }

    public void exe2() {
        System.out.println("Informe sua nota");
        double N1 = sc.nextDouble();
        if (N1 >= 7) {
            System.out.println("Você esta aprovado!!");
        } else if (N1 >= 5 && N1 < 7) {
            System.out.println("Você têm direito de fazer uma prova de recuperação");
        } else {
            System.out.println("Você foi reprovado");
        }
    }

    public void exe3() {
        System.out.println("Digite uma unica letra:");
        String L1 = sc.nextLine();
        L1 = L1.toUpperCase();
        String L2 = "A";
        String L3 = "E";
        String L4 = "I";
        String L5 = "O";
        String L6 = "U";
        if (L1.equals(L2) || L1.equals(L3) || L1.equals(L4) || L1.equals(L5) || L1.equals(L6)) {
            System.out.println("Essa letra é vogal");
        } else {
            System.out.println("Essa letra é consoante");
        }
    }

    public void exe4() {
        double aumento;
        double Sf;
        double P;
        System.out.println("Informe o salario:");
        double S1 = sc.nextDouble();
        if (S1 <= 1280) {
            aumento = S1 * 0.2;
            Sf = S1 + aumento;
            P = 20;
            System.out.println("O salário antes do reajuste: " + S1 + "R$");
            System.out.println("O percentual de aumento aplicado: " + P + "%");
            System.out.println("O valor do aumento: " + aumento + "R$");
            System.out.println("O novo salário, após o aumento: " + Sf + "R$");
        } else if (S1 > 1280 && S1 <= 1700) {
            aumento = S1 * 0.15;
            Sf = S1 + aumento;
            P = 15;
            System.out.println("O salário antes do reajuste: " + S1 + "R$");
            System.out.println("O percentual de aumento aplicado: " + P + "%");
            System.out.println("O valor do aumento: " + aumento + "R$");
            System.out.println("O novo salário, após o aumento: " + Sf + "R$");
        } else if (S1 > 1700 && S1 < 2500) {
            aumento = S1 * 0.1;
            Sf = S1 + aumento;
            P = 10;
            System.out.println("O salário antes do reajuste: " + S1 + "R$");
            System.out.println("O percentual de aumento aplicado: " + P + "%");
            System.out.println("O valor do aumento: " + aumento + "R$");
            System.out.println("O novo salário, após o aumento: " + Sf + "R$");
        } else if (S1 >= 2500) {
            aumento = S1 * 0.05;
            Sf = S1 + aumento;
            P = 5;
            System.out.println("O salário antes do reajuste: " + S1 + "R$");
            System.out.println("O percentual de aumento aplicado: " + P + "%");
            System.out.println("O valor do aumento: " + aumento + "R$");
            System.out.println("O novo salário, após o aumento: " + Sf + "R$");
        }
        
    }

    public void exe5() {
        System.out.println("Informe o ganho por hora");
        double H = sc.nextDouble();
        System.out.println("Informe quantidade de horas trabalhadas");
        double ht = sc.nextDouble();
        double ir;
        double INSS;
        double FGTS;
        double D;
        double sl;
        double B = H * ht;
        if (B <= 900) {
            ir = B* 0;
            INSS = B * 0.1;
            FGTS = B * 0.11;
            D = ir + INSS;
            sl = B - D;
            System.out.println("O salario bruto sera: R$" + B);
            System.out.println("O IR sera: R$" + ir);
            System.out.println("O INSS sera: R$" + INSS);
            System.out.println("O FGTS sera: R$" + FGTS);
            System.out.println("O total descontado sera: R$" + D);
            System.out.println("O sálario líquido sera: R$" + sl);
        } else if (B > 900 && B <= 1500) {
            ir = B*  0.05;
            INSS = B * 0.1;
            FGTS = B * 0.11;
            D = ir + INSS;
            sl = B - D;
            System.out.println("O salario bruto sera: R$" + B);
            System.out.println("O IR sera: R$" + ir);
            System.out.println("O INSS sera: R$" + INSS);
            System.out.println("O FGTS sera: R$" + FGTS);
            System.out.println("O total descontado sera: R$" + D);
            System.out.println("O sálario líquido sera: R$" + sl);
        } else if (B > 1500 && B <= 2500) {
            ir = B*  0.10;
            INSS = B * 0.1;
            FGTS = B * 0.11;
            D = ir + INSS;
            sl = B - D;
            System.out.println("O salario bruto sera: R$" + B);
            System.out.println("O IR sera: R$" + ir);
            System.out.println("O INSS sera: R$" + INSS);
            System.out.println("O FGTS sera: R$" + FGTS);
            System.out.println("O total descontado sera: R$" + D);
            System.out.println("O sálario líquido sera: R$" + sl);
        } else if (B > 2500) {
            ir = B*  0.20;
            INSS = B * 0.1;
            FGTS = B * 0.11;
            D = ir + INSS;
            sl = B - D;
            System.out.println("O salario bruto sera: R$" + B);
            System.out.println("O IR sera: R$" + ir);
            System.out.println("O INSS sera: R$" + INSS);
            System.out.println("O FGTS sera: R$" + FGTS);
            System.out.println("O total descontado sera: R$" + D);
            System.out.println("O sálario líquido sera: R$" + sl);
        }
    }
}
