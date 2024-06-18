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



		}
    }	