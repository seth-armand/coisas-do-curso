package primeira.lista.lista;


import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListaApplication {

public static void main(String[] args) {
		
		  SpringApplication.run(ListaApplication.class, args);

		  java.util.Scanner sc = new java.util.Scanner(System.in);
		  System.out.println("escreva o primeiro numeor ");
		  double numero1 = sc.nextDouble();
		  System.out.println("escreva o segundo numero ");
		  double numero2 = sc.nextDouble();
		  sc.close();
		  double soma = numero1 + numero2;
		  System.out.println("a soma de" + numero1 + "e" + numero2 + "igua a " + soma); }

public void ex2(){

			Scanner scanner = new Scanner(System.in);

			System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

			System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();
			scanner.close();

			if (numero1 > numero2) {
				System.out.println("O primeiro número (" + numero1 + ") é maior que o segundo número (" + numero2 + ").");
			} else if (numero2 > numero1) {
				System.out.println("O segundo número (" + numero2 + ") é maior que o primeiro número (" + numero1 + ").");
			} else {
				System.out.println("Ambos os números são iguais.");
			} }

 public void ex3(){

			Scanner scanner = new Scanner(System.in); 

			System.out.print("Por favor, digite sua idade: ");
            int idade = scanner.nextInt();

			System.out.print("Você é deficiente? (sim/não): ");
			String deficiente = scanner.next().toLowerCase();

			System.out.print("Você é gestante? (sim/não): ");
            String gestante = scanner.next().toLowerCase();

			scanner.close();

			if (idade > 65 || deficiente.equals("sim") || gestante.equals("sim")) {
				System.out.println("Você deve se dirigir à fila preferencial.");
			} else {
				System.out.println("Você deve se dirigir à fila comum.");
			}
		}

public void ex4(){

			Scanner scanner = new Scanner(System.in);

			System.out.print("Por favor, digite sua idade: ");
            int idade = scanner.nextInt();

			scanner.close();

			if (idade < 16) {
				System.out.println("Você não pode entrar no evento.");
			} else if (idade >= 16 && idade < 18) {
				System.out.println("Você pode entrar no evento apenas acompanhado pelos responsáveis.");
			} else {
				System.out.println("Você pode entrar no evento.");
			}
		}

public void ex5(){

		final String LOGIN_CORRETO = "usuario";
        final String SENHA_CORRETA = "senha123";

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu login: ");
        String login = scanner.nextLine();

		System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

		scanner.close();

		boolean loginCorreto = LOGIN_CORRETO.equals(login);
        boolean senhaCorreta = SENHA_CORRETA.equals(senha);

		if (loginCorreto && senhaCorreta) {
            System.out.println("Login e senha corretos. Acesso permitido.");
        } else {
            if (!loginCorreto && !senhaCorreta) {
                System.out.println("Login e senha incorretos.");
            } else if (!loginCorreto) {
                System.out.println("Login incorreto.");
            } else {
                System.out.println("Senha incorreta.");
            }
        }

		}

public void ex6(){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

		System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 6) {
            System.out.println("Aprovado com média " + media);
        } else {
            // Pergunta a nota de recuperação se a média não for suficiente
            System.out.println("Média insuficiente: " + media);
            System.out.print("Digite a nota de recuperação: ");
            double notaRecuperacao = scanner.nextDouble();

			if (nota1 < nota2) {
                nota1 = notaRecuperacao;
            } else {
                nota2 = notaRecuperacao;
            }

			media = (nota1 + nota2) / 2;

			if (media >= 6) {
                System.out.println("Aprovado após recuperação com média " + media);
            } else {
                System.out.println("Reprovado após recuperação com média " + media);
            }
			scanner.close();
        }


		}

public void ex7(){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

		System.out.print("Digite o divisor: ");
        int divisor = scanner.nextInt();

		scanner.close();

		if (divisor != 0 && numero % divisor == 0) {
            System.out.println("O número " + numero + " é divisível por " + divisor + ".");
        } else if (divisor == 0) {
            System.out.println("Divisor não pode ser zero.");
        } else {
            System.out.println("O número " + numero + " não é divisível por " + divisor + ".");
        }

		}

public void ex8(){

		Scanner scanner = new Scanner(System.in);

		String[] perguntas = {
            "Qual é a capital da França?\nA) Paris\nB) Londres\nC) Roma\nD) Berlim",
            "Quem escreveu 'Dom Casmurro'?\nA) Machado de Assis\nB) José de Alencar\nC) Clarice Lispector\nD) Graciliano Ramos",
            "Qual é o maior planeta do Sistema Solar?\nA) Terra\nB) Marte\nC) Júpiter\nD) Saturno",
            "Quem pintou a Mona Lisa?\nA) Leonardo da Vinci\nB) Michelangelo\nC) Rafael\nD) Donatello",
            "Em que ano o homem pisou na Lua pela primeira vez?\nA) 1965\nB) 1969\nC) 1972\nD) 1980"
        };

		char[] respostasCorretas = {'A', 'A', 'C', 'A', 'B'};

		int erros = 0;
        int acertos = 0;

		for (int i = 0; i < perguntas.length; i++) {
            
            System.out.println(perguntas[i]);

			System.out.print("Sua resposta: ");
            char resposta = scanner.next().toUpperCase().charAt(0);

			if (resposta == respostasCorretas[i]) {
                acertos++;
                System.out.println("Resposta correta!\n");
            } else {
                erros++;
                System.out.println("Resposta errada!\n");
            }

			if (erros == 3) {
                System.out.println("Você errou 3 vezes. Você perdeu o jogo.");
                break;
            }
        }

		if (erros < 3) {
            System.out.println("Você chegou ao final do jogo.");
            System.out.println("Número de acertos: " + acertos);
        }

        // Fecha o scanner
        scanner.close();
        
	    }

    }


public record lista2() {

public void ex1(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("O número é zero.");
        } else if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();

    }

public void ex2(){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

    System.out.print("Digite o segundo número: ");
    double numero2 = scanner.nextDouble();

    scanner.close();

    if (numero1 > numero2) {
        System.out.println("O primeiro número (" + numero1 + ") é maior que o segundo número (" + numero2 + ").");
    } else if (numero2 > numero1) {
        System.out.println("O segundo número (" + numero2 + ") é maior que o primeiro número (" + numero1 + ").");
    } else {
        System.out.println("Os dois números são iguais.");
    }
}

public void ex3(){

    Scanner scanner = new Scanner(System.in);

     System.out.print("Qual é a sua idade? ");
        int idade = scanner.nextInt();
        
        System.out.print("Você é deficiente? (sim/não) ");
        String deficiente = scanner.next();

        System.out.print("Você é gestante? (sim/não) ");
        String gestante = scanner.next();

        scanner.close();

        boolean filaPreferencial = false;

        if (idade > 65) {
            filaPreferencial = true;
        } else if (deficiente.equalsIgnoreCase("sim")) {
            filaPreferencial = true;
        } else if (gestante.equalsIgnoreCase("sim")) {
            filaPreferencial = true;
        }

        // Encaminha para a fila apropriada
        if (filaPreferencial) {
            System.out.println("Você deve ser encaminhado para a fila preferencial.");
        } else {
            System.out.println("Você deve ser encaminhado para a fila comum.");
        }
}

public void ex4(){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();

    scanner.close();

    if (idade < 16) {
        System.out.println("Você não pode entrar no evento, pois é menor de 16 anos.");
    } else if (idade >= 16 && idade < 18) {
        System.out.println("Você pode entrar no evento, mas deve estar acompanhado pelos responsáveis.");
    } else {
        System.out.println("Você pode entrar no evento normalmente.");
    }
}

public void ex5(){

    String loginCorreto = "usuario123";
    String senhaCorreta = "senha456";

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu login: ");
        String login = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        scanner.close();

        boolean loginCorretoFlag = login.equals(loginCorreto);
        boolean senhaCorretaFlag = senha.equals(senhaCorreta);

        if (!loginCorretoFlag && !senhaCorretaFlag) {
            System.out.println("Login e senha estão incorretos.");
        } else if (!loginCorretoFlag) {
            System.out.println("Login incorreto.");
        } else if (!senhaCorretaFlag) {
            System.out.println("Senha incorreta.");
        } else {
            System.out.println("Acesso permitido!");
        }
}

public void ex6(){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a nota da primeira prova: ");
    double nota1 = scanner.nextDouble();

    System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Aprovado! Média: " + media);
        } else { System.out.println("Você precisa fazer a prova de recuperação.");
        System.out.print("Digite a nota da prova de recuperação: ");
        double notaRecuperacao = scanner.nextDouble();
        double menorNota = Math.min(nota1, nota2);
        double novaMedia = (menorNota + notaRecuperacao) / 2;

        if (novaMedia >= 6) {
            System.out.println("Aprovado na recuperação! Média final: " + novaMedia);
        } else {
            System.out.println("Reprovado. Média final: " + novaMedia);
        }
    }

    scanner.close();
}

public void ex7(){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número a ser verificado: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o número pelo qual você quer verificar a divisibilidade: ");
        int divisor = scanner.nextInt();

        scanner.close();

        if (divisor == 0) {
            System.out.println("Divisão por zero não é permitida.");
        } else if (numero % divisor == 0) {
            System.out.println("O número " + numero + " é divisível por " + divisor + ".");
        } else {
            System.out.println("O número " + numero + " não é divisível por " + divisor + ".");
        }
}

public void ex8(){

    Scanner scanner = new Scanner(System.in);

    String[][] perguntas = {
        {"Qual é a capital da França?", "Paris", "Londres", "Berlim", "Madrid"},
        {"Qual é o maior planeta do sistema solar?", "Júpiter", "Saturno", "Marte", "Terra"},
        {"Qual é a fórmula química da água?", "H2O", "CO2", "O2", "H2"},
        {"Qual é o menor continente do mundo?", "Oceania", "África", "Antártida", "América do Sul"},
        {"Qual é a linguagem de programação mais usada em 2024?", "Java", "Python", "JavaScript", "C++"}
    };

    int pontos = 0;
    int erros = 0;

    for (int i = 0; i < perguntas.length; i++) {
        System.out.println("\nPergunta " + (i + 1) + ": " + perguntas[i][0]);
        System.out.println("1. " + perguntas[i][1]);
        System.out.println("2. " + perguntas[i][2]);
        System.out.println("3. " + perguntas[i][3]);
        System.out.println("4. " + perguntas[i][4]);

        System.out.print("Escolha a resposta (1-4): ");
        int resposta = scanner.nextInt();

        if (perguntas[i][resposta].equalsIgnoreCase(perguntas[i][1])) {
            System.out.println("Correto!");
            pontos++;
        } else {
            System.out.println("Errado! A resposta correta é: " + perguntas[i][1]);
            erros++;
            if (erros >= 3) {
                System.out.println("Você errou 3 vezes. O jogo terminou.");
                break;
            }
        }
    }

    if (erros < 3) {
        System.out.println("\nVocê completou todas as perguntas!");
    }

    System.out.println("Você acertou " + pontos + " perguntas.");
    scanner.close();
}

}
