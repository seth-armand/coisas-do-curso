package primeira.lista.lista.com;

import java.util.Scanner;

public record exercicios4() {

    public void ex1(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de vendas do dia: ");
        int numVendas = scanner.nextInt();

        double[] vendas = new double[numVendas];

        for (int i = 0; i < numVendas; i++) {
            System.out.print("Digite o valor da venda " + (i + 1) + ": ");
            vendas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double venda : vendas) {
            soma += venda;
        }

        System.out.printf("O total das vendas do dia é: R$ %.2f%n", soma);

        scanner.close();
    }

    public void ex2(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de vendas do dia: ");
        int numVendas = scanner.nextInt();

        double[] vendas = new double[numVendas];

        for (int i = 0; i < numVendas; i++) {
            System.out.print("Digite o valor da venda " + (i + 1) + ": ");
            vendas[i] = scanner.nextDouble();
        }

        double soma = 0;
        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;

        for (double venda : vendas) {
            soma += venda;
            if (venda < menorValor) {
                menorValor = venda;
            }
            if (venda > maiorValor) {
                maiorValor = venda;
            }
        }

        System.out.printf("O total das vendas do dia é: R$ %.2f%n", soma);
        System.out.printf("O menor valor de venda do dia é: R$ %.2f%n", menorValor);
        System.out.printf("O maior valor de venda do dia é: R$ %.2f%n", maiorValor);

        scanner.close();

    }

    public void ex3(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de vendas do dia: ");
        int numVendas = scanner.nextInt();

        double[] vendas = new double[numVendas];

        for (int i = 0; i < numVendas; i++) {
            System.out.print("Digite o valor da venda " + (i + 1) + ": ");
            vendas[i] = scanner.nextDouble();
        }

        double soma = 0;
        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;

        for (double venda : vendas) {
            soma += venda;
            if (venda < menorValor) {
                menorValor = venda;
            }
            if (venda > maiorValor) {
                maiorValor = venda;
            }
        }

        double ticketMedio = soma / numVendas;

        System.out.printf("O total das vendas do dia é: R$ %.2f%n", soma);
        System.out.printf("O menor valor de venda do dia é: R$ %.2f%n", menorValor);
        System.out.printf("O maior valor de venda do dia é: R$ %.2f%n", maiorValor);
        System.out.printf("O ticket médio de venda do dia é: R$ %.2f%n", ticketMedio);

        scanner.close();
    }

    public void ex4(){

        int[] lista = { 3, 5, 6, 7, 8, 10, 22, 55, 110 };

        int contagemPares = 0;

        for (int numero : lista) {
            if (numero % 2 == 0) {
                contagemPares++;
            }
        }

        System.out.println("A quantidade de números pares na lista é: " + contagemPares);
    }

    public void ex5(){

        
    }


}
