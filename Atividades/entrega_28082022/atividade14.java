package Atividades.entrega_28082022;
import java.util.Locale;
import java.util.Scanner;
public class atividade14 
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in).useLocale(Locale.US)) {
            int distancia = input.nextInt();
            double combustiv = input.nextDouble();
            double media = distancia / combustiv;
            System.out.printf("%.3f km/1\n", media);
        }
    }
}