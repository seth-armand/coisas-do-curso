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


        }
    }