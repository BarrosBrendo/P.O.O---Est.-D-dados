package ATIVIDADES;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class atividade05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numeros = 0;
        double par = 0, impar = 0, mediapar = 0, mediageral = 0, qtdNumero = 0, numerospares = 0, soma = 0;

        while (numeros >= 0) {

            numeros = sc.nextDouble();
            qtdNumero++;
            soma = soma + numeros;
            mediageral = soma / qtdNumero;

            if (numeros % 2 != 0) {
                impar++;
            }
            if (numeros % 2 == 0) {
                par++;
                numerospares = numerospares + numeros;
            }
            if (numeros == 0) {
                break;
            }
            mediapar = numerospares / par;
        }
        System.out.println(impar);
        System.out.println(par);
        System.out.println(mediageral);
        System.out.println(mediapar);
    }
}
