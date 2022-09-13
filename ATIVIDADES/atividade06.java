package ATIVIDADES;

import java.util.Scanner;

public class atividade06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double numero = 0;

        for (double i = 100; i < 200; i++) {
        if (i % 2 != 0) {
            numero = i;
        }
        System.out.println(numero);     
        }
    }
}
