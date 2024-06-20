package primeira.lista.lista.com;

import java.util.Scanner;

public record exercicios3() {

public void ex1(){

        Scanner scanner = new Scanner(System.in);

        int segundos = 0;

        while (true) {
            System.out.print("Digite o número de segundos (entre 1 e 59): ");
            segundos = scanner.nextInt();
            
            if (segundos >= 1 && segundos <= 59) {
                break;
            } else {
                System.out.println("Erro: O número deve estar entre 1 e 59.");
            }
        }

        scanner.close();
        
        System.out.println("Iniciando cronômetro...");
        try {
            for (int i = 1; i <= segundos; i++) {
                System.out.println(i + " segundo(s)");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("O cronômetro foi interrompido.");
        }

        System.out.println("Tempo finalizado.");
            
        }

public void ex2(){

            Scanner scanner = new Scanner(System.in);

            System.out.print("insira um numero para saber a sua tabuada: ");
            
            int numero = scanner.nextInt();
            
            System.out.println("a tabuada de " + numero + "sera" );

            for(int i = 1; i <= 10; i++){
                System.out.println(numero + "X" + i + "=" +(numero * i));  
            }

            scanner.close();
        } 
        
public void ex3(){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int inicio = Math.min(numero1, numero2);
        int fim = Math.max(numero1, numero2);

        System.out.println("Números pares entre " + inicio + " e " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
        }

public void ex4(){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Pessoa 1, escolha um número (1-100): ");
        int numeroEscolhido = scanner.nextInt();

        while (numeroEscolhido < 1 || numeroEscolhido > 100) {
            System.out.print("Por favor, escolha um número entre 1 e 100: ");
            numeroEscolhido = scanner.nextInt();
        }
        for (int i = 0; i < 50; i++) {
            System.out.println();
        } int palpite;
        int tentativas = 0;

        System.out.println("Pessoa 2, tente adivinhar o número!");

        while (true) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroEscolhido) {
                System.out.println("Parabéns! Você adivinhou o número em " + tentativas + " tentativas.");
                break;
            } else if (Math.abs(palpite - numeroEscolhido) <= 3) {
                System.out.println("Quase lá!");
            } else if (palpite < numeroEscolhido) {
                if (numeroEscolhido - palpite > 10) {
                    System.out.println("Muito baixo!");
                } else {
                    System.out.println("Tá frio!");
                }
            } else {
                if (palpite - numeroEscolhido > 10) {
                    System.out.println("Muito alto!");
                } else {
                    System.out.println("Tá quente!");
                }
            }
        }

        scanner.close();

        }

public void ex5(){

    Scanner scanner = new Scanner(System.in);

        final String LOGIN_CORRETO = "usuario123";
        final String SENHA_CORRETA = "senha123";

        int tentativas = 0;
        boolean acessoPermitido = false;

        while (tentativas < 3 && !acessoPermitido) {
            System.out.print("Digite o login: ");
            String login = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (login.equals(LOGIN_CORRETO) && senha.equals(SENHA_CORRETA)) {
                acessoPermitido = true;
                System.out.println("Acesso permitido! Bem-vindo.");
            } else {
                tentativas++;
                if (tentativas == 3) {
                    System.out.println("Última tentativa, mais um erro seu acesso será bloqueado!");
                } else {
                    if (!login.equals(LOGIN_CORRETO)) {
                        System.out.println("Login incorreto.");
                    }
                    if (!senha.equals(SENHA_CORRETA)) {
                        System.out.println("Senha incorreta.");
                    }
                }
            }
        }

        if (!acessoPermitido) {
            System.out.println("Acesso bloqueado após 3 tentativas erradas.");
        }

        scanner.close();
        }

public void ex6(){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o numero de andares da piramide: ");
    int andares = scanner.nextInt();

    for (int i = 1; i <= andares; i++) {

        for (int j = 0; j < andares - i; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < 2 * i - 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
    scanner.close();

    }

public void ex7(){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a largura do retângulo: ");
    int largura = scanner.nextInt();

    System.out.print("Digite a altura do retângulo: ");
    int altura = scanner.nextInt();

    for (int i = 0; i < altura; i++) {
        for (int j = 0; j < largura; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    scanner.close();

    }
}