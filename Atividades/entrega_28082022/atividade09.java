package Atividades.entrega_28082022;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class atividade09 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.print("Nome Do Funcionário: ");
            System.out.print("Salario fixo: ");
            double b = input.nextDouble();
            System.out.print("Total de Vendas: ");
            double c = input.nextDouble();
            double bonus = b + c * 0.15;
            DecimalFormat df = new DecimalFormat("0.##");
            System.out.printf("Total: R$ %s", df.format(bonus));
        }
    }
}