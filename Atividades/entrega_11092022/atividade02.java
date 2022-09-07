package Atividades.entrega_11092022;

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();

            if (maior < altura) {
                maior = altura;
            }
            if (menor > altura) {
                menor = altura;
            }
        }
        System.out.println("A maior altura do grupo é: " + maior);
        System.out.println("A menor altura do grupo é: " + menor);
        sc.close();
    }
}
