package entrega_28082022;
import java.util.Scanner;
public class atividade01
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("digite um número: ");
        int A = input.nextInt();
        System.out.print("digite outro número: ");
        int B = input.nextInt();
        int soma = A + B;
        System.out.println("X = " + soma);
        input.close();
    }
}