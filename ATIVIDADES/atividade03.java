package ATIVIDADES;

import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero;
        Integer media = 0, soma = 0, qtdNumero = 0, qtdNumeroPositivo = 0, qtdNumeroNegativo = 0;
        double porcentoPositivo = 0, porcentoNegativo = 0;

        while (true) {
            numero = s.nextInt();
            qtdNumero++;
            soma = soma + numero;
            media = soma / qtdNumero;

            if (numero > 0) {
                qtdNumeroPositivo++;
            }
            if (numero < 0) {
                qtdNumeroNegativo++;
            }
            if (numero == 0) {
                break;
            }
        }

        porcentoPositivo = qtdNumeroPositivo * 100 / qtdNumero;
        porcentoNegativo = qtdNumeroNegativo * 100 / qtdNumero;
        
        System.out.println("A media é: " + media);
        System.out.println("Quantidade de numeros: " + qtdNumero);
        System.out.println("Quantidade de numeros positivos: " + qtdNumeroPositivo);
        System.out.println("Quantidade de numeros negativos: " + qtdNumeroNegativo);
        System.out.println("% de numeros positivos: " + porcentoPositivo);
        System.out.println("% de numero negativos: " + porcentoNegativo);
    }
}
