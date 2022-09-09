package ATIVIDADES;

import java.util.Scanner;

public class atividade04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0, interval01 = 0, intervals02 = 0, intervals03 = 0, intervals04 = 0;
        int intervals = 0;

        while (num >= 0) {
            System.out.println("Digite um valor qualquer; ");
            num = sc.nextInt();

            if (num > 0 && num <= 25) {
                interval01 = interval01 + 1;
            }
            if (num >= 26 && num <= 50) {
                intervals02 = intervals02 + 1;
            }
            if (num >= 51 && num <= 75) {
                intervals03 = intervals03 + 1;
            }
            if (num >= 76 && num <= 100) {
                intervals04 = intervals04 + 1;
            }
            if (num < 0 || num > 100) {
                intervals = intervals + 1;

            }
        }
        System.out.println("0 ~ 25: " + interval01);
        System.out.println("26 ~ 50: " + intervals02);
        System.out.println("51 ~ 75: " + intervals03);
        System.out.println("76 ~ 100: " + intervals04);
        System.out.println("Fora dos intervalos: " + intervals);
    }
}
