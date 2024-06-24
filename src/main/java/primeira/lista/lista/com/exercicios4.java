package primeira.lista.lista.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Inserir um item na lista de compras");
            System.out.println("2. Ver a lista de compras");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o nome do item: ");
                String item = scanner.nextLine();
                listaDeCompras.add(item);
                System.out.println("Item adicionado à lista.");
            } else if (opcao == 2) {
                System.out.println("Lista de compras:");
                for (String item : listaDeCompras) {
                    System.out.println("- " + item);
                }
            } else if (opcao == 3) {
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        }

        scanner.close();
    }

    public void ex6(){

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();

        while (true) {

            System.out.println("Menu:");
            System.out.println("1. Inserir um item na lista de compras");
            System.out.println("2. Ver a lista de compras");
            System.out.println("3. Remover um item da lista de compras");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.print("Digite o nome do item: ");
                String item = scanner.nextLine();
                listaDeCompras.add(item);
                System.out.println("Item adicionado à lista.");
            } else if (opcao == 2) {

                System.out.println("Lista de compras:");
                for (int i = 0; i < listaDeCompras.size(); i++) {
                    System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                }
            } else if (opcao == 3) {

                System.out.println("Lista de compras:");
                for (int i = 0; i < listaDeCompras.size(); i++) {
                    System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                }
                System.out.print("Digite o número do item a ser removido: ");
                int itemIndex = scanner.nextInt() - 1;
                scanner.nextLine();

                if (itemIndex >= 0 && itemIndex < listaDeCompras.size()) {
                    String removedItem = listaDeCompras.remove(itemIndex);
                    System.out.println("Item \"" + removedItem + "\" removido da lista.");
                } else {
                    System.out.println("Número do item inválido.");
                }
            } else if (opcao == 4) {

                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        }

        scanner.close();
    }

    public void ex7(){

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();
        ArrayList<Double> listaDePrecos = new ArrayList<>();

        while (true) {

            System.out.println("Menu:");
            System.out.println("1. Inserir um item na lista de compras");
            System.out.println("2. Ver a lista de compras");
            System.out.println("3. Remover um item da lista de compras");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.print("Digite o nome do item: ");
                String item = scanner.nextLine();
                System.out.print("Digite o preço do item: ");
                double preco = scanner.nextDouble();
                scanner.nextLine();

                listaDeCompras.add(item);
                listaDePrecos.add(preco);
                System.out.println("Item adicionado à lista.");
            } else if (opcao == 2) {

                System.out.println("Lista de compras:");
                for (int i = 0; i < listaDeCompras.size(); i++) {
                    System.out.printf("%d. %s - R$ %.2f%n", i + 1, listaDeCompras.get(i), listaDePrecos.get(i));
                }
            } else if (opcao == 3) {

                System.out.println("Lista de compras:");
                for (int i = 0; i < listaDeCompras.size(); i++) {
                    System.out.printf("%d. %s - R$ %.2f%n", i + 1, listaDeCompras.get(i), listaDePrecos.get(i));
                }
                System.out.print("Digite o número do item a ser removido: ");
                int itemIndex = scanner.nextInt() - 1;
                scanner.nextLine();

                if (itemIndex >= 0 && itemIndex < listaDeCompras.size()) {
                    String removedItem = listaDeCompras.remove(itemIndex);
                    double removedPrice = listaDePrecos.remove(itemIndex);
                    System.out.printf("Item \"%s\" no valor de R$ %.2f removido da lista.%n", removedItem, removedPrice);
                } else {
                    System.out.println("Número do item inválido.");
                }
            } else if (opcao == 4) {

                System.out.println("Saindo do programa...");
                break;
            } else {

                System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        }

        scanner.close();
    }

    public void ex8(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();
        ArrayList<Double> listaDePrecos = new ArrayList<>();

        while (true) {

            System.out.println("Menu:");
            System.out.println("1. Inserir um item na lista de compras");
            System.out.println("2. Ver a lista de compras");
            System.out.println("3. Remover um item da lista de compras");
            System.out.println("4. Ver a lista de compras por ordem de preço (crescente)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.print("Digite o nome do item: ");
                String item = scanner.nextLine();
                System.out.print("Digite o preço do item: ");
                double preco = scanner.nextDouble();
                scanner.nextLine();

                listaDeCompras.add(item);
                listaDePrecos.add(preco);
                System.out.println("Item adicionado à lista.");
            } else if (opcao == 2) {

                System.out.println("Lista de compras:");
                for (int i = 0; i < listaDeCompras.size(); i++) {
                    System.out.printf("%d. %s - R$ %.2f%n", i + 1, listaDeCompras.get(i), listaDePrecos.get(i));
                }
            } else if (opcao == 3) {

                System.out.println("Lista de compras:");
                for (int i = 0; i < listaDeCompras.size(); i++) {
                    System.out.printf("%d. %s - R$ %.2f%n", i + 1, listaDeCompras.get(i), listaDePrecos.get(i));
                }
                System.out.print("Digite o número do item a ser removido: ");
                int itemIndex = scanner.nextInt() - 1;
                scanner.nextLine();

                if (itemIndex >= 0 && itemIndex < listaDeCompras.size()) {
                    String removedItem = listaDeCompras.remove(itemIndex);
                    double removedPrice = listaDePrecos.remove(itemIndex);
                    System.out.printf("Item \"%s\" no valor de R$ %.2f removido da lista.%n", removedItem, removedPrice);
                } else {
                    System.out.println("Número do item inválido.");
                }
            } else if (opcao == 4) {
   
                ArrayList<ItemComPreco> listaOrdenada = new ArrayList<>();
                for (int i = 0; i < listaDeCompras.size(); i++) {
                    listaOrdenada.add(new ItemComPreco(listaDeCompras.get(i), listaDePrecos.get(i)));
                }

                Collections.sort(listaOrdenada, new Comparator<ItemComPreco>() {
                    @Override
                    public int compare(ItemComPreco item1, ItemComPreco item2) {
                        return Double.compare(item1.preco, item2.preco);
                    }
                });

                System.out.println("Lista de compras por ordem de preço (crescente):");
                for (int i = 0; i < listaOrdenada.size(); i++) {
                    System.out.printf("%d. %s - R$ %.2f%n", i + 1, listaOrdenada.get(i).item, listaOrdenada.get(i).preco);
                }
            } else if (opcao == 5) {

                System.out.println("Saindo do programa...");
                break;
            } else {

                System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        }

        scanner.close();
    }

    static class ItemComPreco {
        String item;
        double preco;

        ItemComPreco(String item, double preco) {
            this.item = item;
            this.preco = preco;
        }
    }

}



