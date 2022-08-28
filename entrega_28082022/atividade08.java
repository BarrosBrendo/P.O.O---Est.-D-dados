package entrega_28082022
import java.util.Locale;
import java.util.Scanner;
public class atividade08
{
  // OBS: LEMBRAR DE COLOCAR O LOCALE PARA USAR O "." NO LUGAR DA ","
    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in).useLocale(Locale.US);
         System.out.print("Nº Do Funcionário: ");
         int a = input.nextInt();
         System.out.print("Nº de Horas Trabalhadas: ");
         double b = input.nextDouble();
         System.out.print("Valor recebido por hora: ");
         double c = input.nextDouble();
         double salario = (b*c);
         System.out.println("NUMBER: " + a);
         System.out.println("SALARY = U$ " + salario);
    }
}