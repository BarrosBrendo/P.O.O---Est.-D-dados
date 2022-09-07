package Atividades.entrega_28082022;
import java.util.Locale;
import java.util.Scanner;
public class atividade13
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in).useLocale(Locale.US)) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int abs = ((a + b) + Math.abs(a-b)) /2;
            int abs2 = ((abs + c) + Math.abs(abs - c)) /2;
            System.out.println(abs2 + " eh o maior");
        }
    }
}