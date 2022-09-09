package ATIVIDADES;

public class atividade01 {
    public static void main(String[] args) {
        double numero = 0;

        for (int i = 0; i < 500; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                numero = numero + i;
            }
        }
        System.out.println(numero);
    }

}
