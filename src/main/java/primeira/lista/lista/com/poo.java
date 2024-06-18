package primeira.lista.lista.com;

public record poo() {

    public void ex1(){

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("escreva o primeiro numero");
        double numero1 = sc.nextDouble();

        System.out.println("escreva o segundo numero ");
        double numero2 = sc.nextDouble();

        sc.close();

        double soma = numero1 + numero2;
        System.out.println("a soma de " + numero1 + " e " + numero2 + "e igual a " + soma);

    }



}
