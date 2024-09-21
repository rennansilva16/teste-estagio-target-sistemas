1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

- Resolução:

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

2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

- Resolução:

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

3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
Ao final do processamento, qual será o valor da variável SOMA?

- Resolução:

        public class Main {
            public static void main(String[] args) {
                int INDICE = 12;
                int SOMA = 0;
                int K = 1;
                while (K < INDICE ) {
                    K = K + 1;
                    SOMA = SOMA + K;
                }
                System.out.println("O valor da variável SOMA será: " + SOMA);
            }
        }
        O valor da variável SOMA será: 77


4) Descubra a lógica e complete o próximo elemento:

- Resolução:
    - a) 1, 3, 5, 7, _9_
    - b) 2, 4, 8, 16, 32, 64, _128_
    - c) 0, 1, 4, 9, 16, 25, 36, _49_
    - d) 4, 16, 36, 64, _100_
    - e) 1, 1, 2, 3, 5, 8, _13_
    - f) 2,10, 12, 16, 17, 18, 19, _22_

5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada? 

- Resolução:
    - Eu ligaria uma lâmpada por um período de tempo suficiente para que ela esquentasse. Depois, verificaria qual lâmpada está quente e associaria essa lâmpada ao interruptor que foi ligado. Repetiria o processo com outro interruptor e outra lâmpada. Por fim, o interruptor que restar será o da última lâmpada. Se algum interruptor ligado não acender uma lâmpada, eu concluiria que a lâmpada em outra sala pertence àquele interruptor.