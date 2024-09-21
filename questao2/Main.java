package questao2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma palavra ou frase para a verificação: ");
        String resultado = scanner.nextLine();

        int contador = 0;

        String resultadoLower = resultado.toLowerCase();

        for (char caractere : resultadoLower.toCharArray()) {
            if (caractere == 'a') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'A' foi digitada e escrita " + contador + " vez(es).");
        } else {
            System.out.println("A letra 'A' não foi digitada");
        }
        scanner.close();
    }
}