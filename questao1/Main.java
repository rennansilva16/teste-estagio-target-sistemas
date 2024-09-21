package questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numeroDigitado = scanner.nextInt();
      
        int primeiroNumbero = 0;
        int segundoNumbero = 1;
        boolean pertence = false;
        
        while (primeiroNumbero <= numeroDigitado) {
            if (primeiroNumbero == numeroDigitado) {
                pertence = true;
                break;
            }

            int resultado = primeiroNumbero + segundoNumbero;
            primeiroNumbero = segundoNumbero;
            segundoNumbero = resultado;
        }

        if (pertence) {
            System.out.println("O número " + numeroDigitado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroDigitado + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}