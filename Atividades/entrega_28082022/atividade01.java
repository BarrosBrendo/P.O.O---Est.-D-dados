package Atividades.entrega_28082022;
import java.util.Scanner;
public class atividade01 {
    public static void main(String[] args) 
    {
        try (var s = new Scanner(System.in)) {
            System.out.print("digite um número: ");
            int A = s.nextInt();
            System.out.print("digite outro número: ");
            int B = s.nextInt();
            int soma = A + B;
            System.out.println("X = " + soma);
        }
    }
}
