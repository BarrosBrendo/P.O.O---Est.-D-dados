package entrega_28082022;
import java.util.Scanner;
public class ativadade02 {
    public static void main(String[] args) 
    {
        try (Scanner s = new Scanner(System.in)) {
            // Calculo da área de circulo
            System.out.print("digite um número:");
            double pi = 3.14159;
            double raio = s.nextDouble();
            double area = raio * raio * pi;
            System.out.printf("A=%.4f\n", area);
        }   
    } 
}
