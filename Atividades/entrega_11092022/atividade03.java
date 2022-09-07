package Atividades.entrega_11092022;

import java.util.Scanner;

//Desenvolver um algoritmo que leia um número não determinado de valores e calcule e escreva a
//média aritmética dos valores lidos, a quantidade de valores positivos, a quantidade de valores
//negativos e o percentual de valores negativos e positivos.
public class atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media;

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite um numero: ");
            double num = sc.nextDouble();
            media = num + num / i;
            System.out.println("A media é: " + media);
        }

        

        /*
         * for (int i = 0; i < 10; i++) {
         * double num, media;
         * 
         * num = sc.nextDouble();
         * media = num + num / 10;
         * System.out.println("A media é: " + media);
         * }
         */

        sc.close();
    }
}
